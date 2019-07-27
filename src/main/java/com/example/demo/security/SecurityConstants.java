package com.example.demo.security;

public class SecurityConstants {
  // ダミー実装:本実装では環境変数などで指定してソースコード上に持たせないこと
  /** JWTのtoken作成用のパスワード鍵 */
  public static final String SECRET = "yfujii01_secret";

  /** JWT tokenの有効期限 */
  public static final long EXPIRATION_TIME = 28_800_000; // 8hours

  public static final String TOKEN_PREFIX = "Bearer ";
  public static final String HEADER_STRING = "Authorization";
}

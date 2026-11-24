package com.google.android.recaptcha;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class RecaptchaException extends Exception {
    private final RecaptchaErrorCode errorCode;
    private final String errorMessage;

    public /* synthetic */ RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str, int i, fb3 fb3Var) {
        this(recaptchaErrorCode, (i & 2) != 0 ? recaptchaErrorCode.getErrorMessage() : str);
    }

    public final RecaptchaErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str) {
        super(str);
        this.errorCode = recaptchaErrorCode;
        this.errorMessage = str;
    }
}

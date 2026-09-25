package com.google.android.recaptcha;

import kotlin.jvm.internal.e;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class RecaptchaException extends Exception {
    private final RecaptchaErrorCode errorCode;
    private final String errorMessage;

    public RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str) {
        super(str);
        this.errorCode = recaptchaErrorCode;
        this.errorMessage = str;
    }

    public final RecaptchaErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str, int i10, e eVar) {
        this(recaptchaErrorCode, (i10 & 2) != 0 ? recaptchaErrorCode.getErrorMessage() : str);
    }
}

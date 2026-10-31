package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
class PaymentFormActivity$TelegramWebviewProxy {
    public final /* synthetic */ sm0 a;

    public PaymentFormActivity$TelegramWebviewProxy(sm0 sm0Var) {
        this.a = sm0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.i0.g3(new p1(this, str, str2, 1));
    }
}

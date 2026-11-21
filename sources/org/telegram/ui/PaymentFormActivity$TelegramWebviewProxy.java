package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
class PaymentFormActivity$TelegramWebviewProxy {
    public final /* synthetic */ ml0 a;

    public PaymentFormActivity$TelegramWebviewProxy(ml0 ml0Var) {
        this.a = ml0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new o1(this, str, str2, 1));
    }
}

package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
class PaymentFormActivity$TelegramWebviewProxy {
    public final /* synthetic */ hl0 a;

    public PaymentFormActivity$TelegramWebviewProxy(hl0 hl0Var) {
        this.a = hl0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new o1(this, str, str2, 1));
    }
}

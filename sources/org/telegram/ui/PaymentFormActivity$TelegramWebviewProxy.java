package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
class PaymentFormActivity$TelegramWebviewProxy {
    public final /* synthetic */ qm0 a;

    public PaymentFormActivity$TelegramWebviewProxy(qm0 qm0Var) {
        this.a = qm0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.i0.g3(new p1(this, str, str2, 1));
    }
}

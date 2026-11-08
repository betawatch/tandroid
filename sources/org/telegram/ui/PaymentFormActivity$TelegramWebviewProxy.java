package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
class PaymentFormActivity$TelegramWebviewProxy {
    public final /* synthetic */ dl0 a;

    public PaymentFormActivity$TelegramWebviewProxy(dl0 dl0Var) {
        this.a = dl0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new p1(this, str, str2, 1));
    }
}

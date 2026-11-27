package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
class PaymentFormActivity$TelegramWebviewProxy {
    public final /* synthetic */ p a;

    public PaymentFormActivity$TelegramWebviewProxy(p pVar) {
        this.a = pVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        hl.c3(new h(this, str, str2, (byte) 1));
    }
}

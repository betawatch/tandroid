package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
class PaymentFormActivity$TelegramWebviewProxy {
    public final /* synthetic */ p a;

    public PaymentFormActivity$TelegramWebviewProxy(p pVar) {
        this.a = pVar;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        gl.c3(new h(this, str, str2, (byte) 1));
    }
}

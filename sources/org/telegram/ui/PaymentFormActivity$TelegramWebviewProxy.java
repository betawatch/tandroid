package org.telegram.ui;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

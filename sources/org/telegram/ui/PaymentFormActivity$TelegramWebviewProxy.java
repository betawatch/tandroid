package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
class PaymentFormActivity$TelegramWebviewProxy {
    public final /* synthetic */ wo0 a;

    public PaymentFormActivity$TelegramWebviewProxy(wo0 wo0Var) {
        this.a = wo0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new q1(this, str, str2, 1));
    }
}

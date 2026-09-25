package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ hn0(oo0 oo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = oo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oo0.e0(this.b, this.c);
                break;
            case 1:
                oo0 oo0Var = this.b;
                Utilities.Callback callback = oo0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                oo0Var.D0(false);
                oo0Var.z0 = true;
                oo0Var.H0(true, true);
                org.telegram.ui.Components.uq uqVar = oo0Var.r;
                if (uqVar != null) {
                    uqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = oo0Var.n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    oo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = oo0Var.getParentLayout();
                Activity parentActivity = oo0Var.getParentActivity();
                oo0Var.getMessagesController().newMessageCallback = new b7(oo0Var, parentLayout, parentActivity, 17);
                WebView webView = oo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = oo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    oo0Var.x = str;
                    webView2.loadUrl(str);
                }
                oo0Var.a1 = true;
                oo0Var.f1 = 3;
                no0 no0Var = oo0Var.Z0;
                if (no0Var != null) {
                    no0Var.a(3);
                    break;
                }
                break;
            default:
                oo0.c0(this.b, this.c);
                break;
        }
    }
}

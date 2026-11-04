package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ck0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ck0(dl0 dl0Var, TLObject tLObject, int i3) {
        this.a = i3;
        this.b = dl0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dl0.j0(this.b, this.c);
                break;
            case 1:
                dl0 dl0Var = this.b;
                org.telegram.messenger.u10 u10Var = dl0Var.e1;
                TLObject tLObject = this.c;
                if (u10Var != null) {
                    u10Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                dl0Var.J0(false);
                dl0Var.A0 = true;
                dl0Var.N0(true, true);
                org.telegram.ui.Components.aq aqVar = dl0Var.r;
                if (aqVar != null) {
                    aqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var = dl0Var.n;
                if (q0Var != null) {
                    q0Var.setEnabled(false);
                    dl0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.q4 parentLayout = dl0Var.getParentLayout();
                Activity parentActivity = dl0Var.getParentActivity();
                dl0Var.getMessagesController().l7 = new b7(dl0Var, parentLayout, parentActivity, 17);
                WebView webView = dl0Var.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = dl0Var.x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    dl0Var.y = str;
                    webView2.loadUrl(str);
                }
                dl0Var.b1 = true;
                dl0Var.g1 = 3;
                cl0 cl0Var = dl0Var.a1;
                if (cl0Var != null) {
                    cl0Var.e(3);
                    break;
                }
                break;
            default:
                dl0.h0(this.b, this.c);
                break;
        }
    }
}

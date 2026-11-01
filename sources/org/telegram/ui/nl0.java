package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ nl0(qm0 qm0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = qm0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qm0.j0(this.b, this.c);
                break;
            case 1:
                qm0 qm0Var = this.b;
                org.telegram.messenger.r20 r20Var = qm0Var.d1;
                TLObject tLObject = this.c;
                if (r20Var != null) {
                    r20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                qm0Var.J0(false);
                qm0Var.z0 = true;
                qm0Var.N0(true, true);
                org.telegram.ui.Components.iq iqVar = qm0Var.r;
                if (iqVar != null) {
                    iqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.t0 t0Var = qm0Var.n;
                if (t0Var != null) {
                    t0Var.setEnabled(false);
                    qm0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.z4 parentLayout = qm0Var.getParentLayout();
                Activity parentActivity = qm0Var.getParentActivity();
                qm0Var.getMessagesController().m7 = new a7(qm0Var, parentLayout, parentActivity, 17);
                WebView webView = qm0Var.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = qm0Var.x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    qm0Var.y = str;
                    webView2.loadUrl(str);
                }
                qm0Var.a1 = true;
                qm0Var.f1 = 3;
                pm0 pm0Var = qm0Var.Z0;
                if (pm0Var != null) {
                    pm0Var.e(3);
                    break;
                }
                break;
            default:
                qm0.h0(this.b, this.c);
                break;
        }
    }
}

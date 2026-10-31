package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ pl0(sm0 sm0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = sm0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sm0.i0(this.b, this.c);
                break;
            case 1:
                sm0 sm0Var = this.b;
                org.telegram.messenger.q20 q20Var = sm0Var.d1;
                TLObject tLObject = this.c;
                if (q20Var != null) {
                    q20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                sm0Var.I0(false);
                sm0Var.z0 = true;
                sm0Var.M0(true, true);
                org.telegram.ui.Components.iq iqVar = sm0Var.r;
                if (iqVar != null) {
                    iqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.t0 t0Var = sm0Var.n;
                if (t0Var != null) {
                    t0Var.setEnabled(false);
                    sm0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.z4 parentLayout = sm0Var.getParentLayout();
                Activity parentActivity = sm0Var.getParentActivity();
                sm0Var.getMessagesController().m7 = new a7(sm0Var, parentLayout, parentActivity, 17);
                WebView webView = sm0Var.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = sm0Var.x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    sm0Var.y = str;
                    webView2.loadUrl(str);
                }
                sm0Var.a1 = true;
                sm0Var.f1 = 3;
                rm0 rm0Var = sm0Var.Z0;
                if (rm0Var != null) {
                    rm0Var.e(3);
                    break;
                }
                break;
            default:
                sm0.g0(this.b, this.c);
                break;
        }
    }
}

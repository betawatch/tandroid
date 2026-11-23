package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ jk0(kl0 kl0Var, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = kl0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kl0.j0(this.b, this.c);
                break;
            case 1:
                kl0 kl0Var = this.b;
                org.telegram.messenger.w10 w10Var = kl0Var.e1;
                TLObject tLObject = this.c;
                if (w10Var != null) {
                    w10Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                kl0Var.J0(false);
                kl0Var.A0 = true;
                kl0Var.N0(true, true);
                org.telegram.ui.Components.nq nqVar = kl0Var.r;
                if (nqVar != null) {
                    nqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var = kl0Var.n;
                if (q0Var != null) {
                    q0Var.setEnabled(false);
                    kl0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.r4 parentLayout = kl0Var.getParentLayout();
                Activity parentActivity = kl0Var.getParentActivity();
                kl0Var.getMessagesController().o7 = new a7(kl0Var, parentLayout, parentActivity, 17);
                WebView webView = kl0Var.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = kl0Var.x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    kl0Var.y = str;
                    webView2.loadUrl(str);
                }
                kl0Var.b1 = true;
                kl0Var.g1 = 3;
                jl0 jl0Var = kl0Var.a1;
                if (jl0Var != null) {
                    jl0Var.e(3);
                    break;
                }
                break;
            default:
                kl0.h0(this.b, this.c);
                break;
        }
    }
}

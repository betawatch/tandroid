package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ik0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ik0(jl0 jl0Var, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = jl0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jl0.j0(this.b, this.c);
                break;
            case 1:
                jl0 jl0Var = this.b;
                org.telegram.messenger.z10 z10Var = jl0Var.e1;
                TLObject tLObject = this.c;
                if (z10Var != null) {
                    z10Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                jl0Var.J0(false);
                jl0Var.A0 = true;
                jl0Var.N0(true, true);
                org.telegram.ui.Components.hq hqVar = jl0Var.r;
                if (hqVar != null) {
                    hqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.q0 q0Var = jl0Var.n;
                if (q0Var != null) {
                    q0Var.setEnabled(false);
                    jl0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.o4 parentLayout = jl0Var.getParentLayout();
                Activity parentActivity = jl0Var.getParentActivity();
                jl0Var.getMessagesController().m7 = new a7(jl0Var, parentLayout, parentActivity, 17);
                WebView webView = jl0Var.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = jl0Var.x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    jl0Var.y = str;
                    webView2.loadUrl(str);
                }
                jl0Var.b1 = true;
                jl0Var.g1 = 3;
                il0 il0Var = jl0Var.a1;
                if (il0Var != null) {
                    il0Var.e(3);
                    break;
                }
                break;
            default:
                jl0.h0(this.b, this.c);
                break;
        }
    }
}

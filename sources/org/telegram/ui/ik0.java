package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                org.telegram.messenger.c20 c20Var = jl0Var.d1;
                TLObject tLObject = this.c;
                if (c20Var != null) {
                    c20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                jl0Var.J0(false);
                jl0Var.z0 = true;
                jl0Var.N0(true, true);
                org.telegram.ui.Components.zp zpVar = jl0Var.r;
                if (zpVar != null) {
                    zpVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var = jl0Var.n;
                if (r0Var != null) {
                    r0Var.setEnabled(false);
                    jl0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.q4 parentLayout = jl0Var.getParentLayout();
                Activity parentActivity = jl0Var.getParentActivity();
                jl0Var.getMessagesController().l7 = new a7(jl0Var, parentLayout, parentActivity, 17);
                WebView webView = jl0Var.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = jl0Var.x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    jl0Var.y = str;
                    webView2.loadUrl(str);
                }
                jl0Var.a1 = true;
                jl0Var.f1 = 3;
                il0 il0Var = jl0Var.Z0;
                if (il0Var != null) {
                    il0Var.b(3);
                    break;
                }
                break;
            default:
                jl0.h0(this.b, this.c);
                break;
        }
    }
}

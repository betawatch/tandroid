package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ lk0(ml0 ml0Var, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = ml0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ml0.j0(this.b, this.c);
                break;
            case 1:
                ml0 ml0Var = this.b;
                org.telegram.messenger.x10 x10Var = ml0Var.e1;
                TLObject tLObject = this.c;
                if (x10Var != null) {
                    x10Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                ml0Var.J0(false);
                ml0Var.A0 = true;
                ml0Var.N0(true, true);
                org.telegram.ui.Components.oq oqVar = ml0Var.r;
                if (oqVar != null) {
                    oqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var = ml0Var.n;
                if (r0Var != null) {
                    r0Var.setEnabled(false);
                    ml0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.s4 parentLayout = ml0Var.getParentLayout();
                Activity parentActivity = ml0Var.getParentActivity();
                ml0Var.getMessagesController().o7 = new z6(ml0Var, parentLayout, parentActivity, 17);
                WebView webView = ml0Var.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = ml0Var.x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    ml0Var.y = str;
                    webView2.loadUrl(str);
                }
                ml0Var.b1 = true;
                ml0Var.g1 = 3;
                ll0 ll0Var = ml0Var.a1;
                if (ll0Var != null) {
                    ll0Var.d(3);
                    break;
                }
                break;
            default:
                ml0.h0(this.b, this.c);
                break;
        }
    }
}

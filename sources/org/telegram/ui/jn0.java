package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ jn0(qo0 qo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = qo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qo0.e0(this.b, this.c);
                break;
            case 1:
                qo0 qo0Var = this.b;
                Utilities.Callback callback = qo0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                qo0Var.D0(false);
                qo0Var.z0 = true;
                qo0Var.H0(true, true);
                org.telegram.ui.Components.uq uqVar = qo0Var.r;
                if (uqVar != null) {
                    uqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = qo0Var.n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    qo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.c5 parentLayout = qo0Var.getParentLayout();
                Activity parentActivity = qo0Var.getParentActivity();
                qo0Var.getMessagesController().newMessageCallback = new b7(qo0Var, parentLayout, parentActivity, 17);
                WebView webView = qo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = qo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    qo0Var.x = str;
                    webView2.loadUrl(str);
                }
                qo0Var.a1 = true;
                qo0Var.f1 = 3;
                po0 po0Var = qo0Var.Z0;
                if (po0Var != null) {
                    po0Var.a(3);
                    break;
                }
                break;
            default:
                qo0.c0(this.b, this.c);
                break;
        }
    }
}

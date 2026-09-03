package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ gn0(lo0 lo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = lo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lo0.e0(this.b, this.c);
                break;
            case 1:
                lo0 lo0Var = this.b;
                Utilities.Callback callback = lo0Var.a1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                lo0Var.D0(false);
                lo0Var.w0 = true;
                lo0Var.H0(true, true);
                org.telegram.ui.Components.tq tqVar = lo0Var.r;
                if (tqVar != null) {
                    tqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = lo0Var.n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    lo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.f5 parentLayout = lo0Var.getParentLayout();
                Activity parentActivity = lo0Var.getParentActivity();
                lo0Var.getMessagesController().newMessageCallback = new d7(lo0Var, parentLayout, parentActivity, 17);
                WebView webView = lo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = lo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    lo0Var.x = str;
                    webView2.loadUrl(str);
                }
                lo0Var.X0 = true;
                lo0Var.c1 = 3;
                ko0 ko0Var = lo0Var.W0;
                if (ko0Var != null) {
                    ko0Var.a(3);
                    break;
                }
                break;
            default:
                lo0.c0(this.b, this.c);
                break;
        }
    }
}

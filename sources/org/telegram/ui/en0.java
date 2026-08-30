package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ en0(jo0 jo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = jo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jo0.e0(this.b, this.c);
                break;
            case 1:
                jo0 jo0Var = this.b;
                Utilities.Callback callback = jo0Var.a1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                jo0Var.D0(false);
                jo0Var.w0 = true;
                jo0Var.H0(true, true);
                org.telegram.ui.Components.rq rqVar = jo0Var.r;
                if (rqVar != null) {
                    rqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = jo0Var.n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    jo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.e5 parentLayout = jo0Var.getParentLayout();
                Activity parentActivity = jo0Var.getParentActivity();
                jo0Var.getMessagesController().newMessageCallback = new d7(jo0Var, parentLayout, parentActivity, 17);
                WebView webView = jo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = jo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    jo0Var.x = str;
                    webView2.loadUrl(str);
                }
                jo0Var.X0 = true;
                jo0Var.c1 = 3;
                io0 io0Var = jo0Var.W0;
                if (io0Var != null) {
                    io0Var.a(3);
                    break;
                }
                break;
            default:
                jo0.c0(this.b, this.c);
                break;
        }
    }
}

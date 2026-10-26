package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ jn0(po0 po0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = po0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                po0.f0(this.b, this.c);
                break;
            case 1:
                po0 po0Var = this.b;
                Utilities.Callback callback = po0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                po0Var.E0(false);
                po0Var.z0 = true;
                po0Var.I0(true, true);
                org.telegram.ui.Components.er erVar = po0Var.r;
                if (erVar != null) {
                    erVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = po0Var.n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    po0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.j5 parentLayout = po0Var.getParentLayout();
                Activity parentActivity = po0Var.getParentActivity();
                po0Var.getMessagesController().newMessageCallback = new e7(po0Var, parentLayout, parentActivity, 17);
                WebView webView = po0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = po0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    po0Var.x = str;
                    webView2.loadUrl(str);
                }
                po0Var.a1 = true;
                po0Var.f1 = 3;
                oo0 oo0Var = po0Var.Z0;
                if (oo0Var != null) {
                    oo0Var.a(3);
                    break;
                }
                break;
            default:
                po0.d0(this.b, this.c);
                break;
        }
    }
}

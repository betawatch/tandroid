package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ln0(ro0 ro0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = ro0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ro0.f0(this.b, this.c);
                break;
            case 1:
                ro0 ro0Var = this.b;
                Utilities.Callback callback = ro0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                ro0Var.E0(false);
                ro0Var.z0 = true;
                ro0Var.I0(true, true);
                org.telegram.ui.Components.er erVar = ro0Var.r;
                if (erVar != null) {
                    erVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = ro0Var.n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    ro0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.j5 parentLayout = ro0Var.getParentLayout();
                Activity parentActivity = ro0Var.getParentActivity();
                ro0Var.getMessagesController().newMessageCallback = new e7(ro0Var, parentLayout, parentActivity, 17);
                WebView webView = ro0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = ro0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    ro0Var.x = str;
                    webView2.loadUrl(str);
                }
                ro0Var.a1 = true;
                ro0Var.f1 = 3;
                qo0 qo0Var = ro0Var.Z0;
                if (qo0Var != null) {
                    qo0Var.a(3);
                    break;
                }
                break;
            default:
                ro0.d0(this.b, this.c);
                break;
        }
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ gk0(hl0 hl0Var, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = hl0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hl0.j0(this.b, this.c);
                break;
            case 1:
                hl0 hl0Var = this.b;
                org.telegram.messenger.c20 c20Var = hl0Var.d1;
                TLObject tLObject = this.c;
                if (c20Var != null) {
                    c20Var.a((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                hl0Var.J0(false);
                hl0Var.z0 = true;
                hl0Var.N0(true, true);
                org.telegram.ui.Components.zp zpVar = hl0Var.r;
                if (zpVar != null) {
                    zpVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var = hl0Var.n;
                if (r0Var != null) {
                    r0Var.setEnabled(false);
                    hl0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.q4 parentLayout = hl0Var.getParentLayout();
                Activity parentActivity = hl0Var.getParentActivity();
                hl0Var.getMessagesController().l7 = new a7(hl0Var, parentLayout, parentActivity, 17);
                WebView webView = hl0Var.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = hl0Var.x;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    hl0Var.y = str;
                    webView2.loadUrl(str);
                }
                hl0Var.a1 = true;
                hl0Var.f1 = 3;
                gl0 gl0Var = hl0Var.Z0;
                if (gl0Var != null) {
                    gl0Var.b(3);
                    break;
                }
                break;
            default:
                hl0.h0(this.b, this.c);
                break;
        }
    }
}

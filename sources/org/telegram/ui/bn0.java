package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ io0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ bn0(io0 io0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = io0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                io0.e0(this.b, this.c);
                break;
            case 1:
                io0 io0Var = this.b;
                Utilities.Callback callback = io0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                io0Var.D0(false);
                io0Var.z0 = true;
                io0Var.H0(true, true);
                org.telegram.ui.Components.cr crVar = io0Var.r;
                if (crVar != null) {
                    crVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = io0Var.n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    io0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.h5 parentLayout = io0Var.getParentLayout();
                Activity parentActivity = io0Var.getParentActivity();
                io0Var.getMessagesController().newMessageCallback = new e7(io0Var, parentLayout, parentActivity, 17);
                WebView webView = io0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = io0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    io0Var.x = str;
                    webView2.loadUrl(str);
                }
                io0Var.a1 = true;
                io0Var.f1 = 3;
                ho0 ho0Var = io0Var.Z0;
                if (ho0Var != null) {
                    ho0Var.a(3);
                    break;
                }
                break;
            default:
                io0.c0(this.b, this.c);
                break;
        }
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ pn0(wo0 wo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = wo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wo0.e0(this.b, this.c);
                break;
            case 1:
                wo0 wo0Var = this.b;
                Utilities.Callback callback = wo0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                wo0Var.D0(false);
                wo0Var.z0 = true;
                wo0Var.H0(true, true);
                org.telegram.ui.Components.zq zqVar = wo0Var.r;
                if (zqVar != null) {
                    zqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = wo0Var.n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    wo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.f5 parentLayout = wo0Var.getParentLayout();
                Activity parentActivity = wo0Var.getParentActivity();
                wo0Var.getMessagesController().newMessageCallback = new a7(wo0Var, parentLayout, parentActivity, 17);
                WebView webView = wo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = wo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    wo0Var.x = str;
                    webView2.loadUrl(str);
                }
                wo0Var.a1 = true;
                wo0Var.f1 = 3;
                vo0 vo0Var = wo0Var.Z0;
                if (vo0Var != null) {
                    vo0Var.a(3);
                    break;
                }
                break;
            default:
                wo0.c0(this.b, this.c);
                break;
        }
    }
}

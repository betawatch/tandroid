package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class on0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ on0(vo0 vo0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = vo0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vo0.e0(this.b, this.c);
                break;
            case 1:
                vo0 vo0Var = this.b;
                Utilities.Callback callback = vo0Var.d1;
                TLObject tLObject = this.c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                vo0Var.D0(false);
                vo0Var.z0 = true;
                vo0Var.H0(true, true);
                org.telegram.ui.Components.jr jrVar = vo0Var.r;
                if (jrVar != null) {
                    jrVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = vo0Var.n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    vo0Var.n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = vo0Var.getParentLayout();
                Activity parentActivity = vo0Var.getParentActivity();
                vo0Var.getMessagesController().newMessageCallback = new a7(vo0Var, parentLayout, parentActivity, 17);
                WebView webView = vo0Var.w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = vo0Var.w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    vo0Var.x = str;
                    webView2.loadUrl(str);
                }
                vo0Var.a1 = true;
                vo0Var.f1 = 3;
                uo0 uo0Var = vo0Var.Z0;
                if (uo0Var != null) {
                    uo0Var.a(3);
                    break;
                }
                break;
            default:
                vo0.c0(this.b, this.c);
                break;
        }
    }
}

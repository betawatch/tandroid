package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe0 b;

    public /* synthetic */ je0(pe0 pe0Var, int i10) {
        this.a = i10;
        this.b = pe0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                pe0 pe0Var = this.b;
                pe0Var.c(true);
                pe0Var.O.u1(0, true, null, true);
                pe0Var.o();
                break;
            case 1:
                pe0 pe0Var2 = this.b;
                pe0Var2.O.p0.popup = false;
                pe0Var2.h(null);
                break;
            case 2:
                pe0 pe0Var3 = this.b;
                fg0 fg0Var = pe0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new je0(pe0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new je0(pe0Var3, 4));
                fg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                pe0 pe0Var4 = this.b;
                pe0Var4.O.p0.popup = false;
                pe0Var4.h(null);
                break;
            default:
                pe0 pe0Var5 = this.b;
                pe0Var5.c(true);
                pe0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe0 b;

    public /* synthetic */ je0(pe0 pe0Var, int i10) {
        this.a = i10;
        this.b = pe0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                pe0 pe0Var = this.b;
                pe0Var.c(true);
                pe0Var.K.u1(0, true, null, true);
                pe0Var.o();
                break;
            case 1:
                pe0 pe0Var2 = this.b;
                pe0Var2.K.l0.popup = false;
                pe0Var2.h(null);
                break;
            case 2:
                pe0 pe0Var3 = this.b;
                fg0 fg0Var = pe0Var3.K;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.P = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new je0(pe0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new je0(pe0Var3, 4));
                fg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                pe0 pe0Var4 = this.b;
                pe0Var4.K.l0.popup = false;
                pe0Var4.h(null);
                break;
            default:
                pe0 pe0Var5 = this.b;
                pe0Var5.c(true);
                pe0Var5.K.u1(0, true, null, true);
                break;
        }
    }
}

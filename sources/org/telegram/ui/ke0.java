package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe0 b;

    public /* synthetic */ ke0(qe0 qe0Var, int i9) {
        this.a = i9;
        this.b = qe0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                qe0 qe0Var = this.b;
                qe0Var.c(true);
                qe0Var.K.u1(0, true, null, true);
                qe0Var.o();
                break;
            case 1:
                qe0 qe0Var2 = this.b;
                qe0Var2.K.l0.popup = false;
                qe0Var2.h(null);
                break;
            case 2:
                qe0 qe0Var3 = this.b;
                fg0 fg0Var = qe0Var3.K;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.P = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ke0(qe0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ke0(qe0Var3, 4));
                fg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                qe0 qe0Var4 = this.b;
                qe0Var4.K.l0.popup = false;
                qe0Var4.h(null);
                break;
            default:
                qe0 qe0Var5 = this.b;
                qe0Var5.c(true);
                qe0Var5.K.u1(0, true, null, true);
                break;
        }
    }
}

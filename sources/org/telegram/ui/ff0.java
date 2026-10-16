package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf0 b;

    public /* synthetic */ ff0(lf0 lf0Var, int i10) {
        this.a = i10;
        this.b = lf0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                lf0 lf0Var = this.b;
                lf0Var.c(true);
                lf0Var.O.u1(0, true, null, true);
                lf0Var.o();
                break;
            case 1:
                lf0 lf0Var2 = this.b;
                lf0Var2.O.p0.popup = false;
                lf0Var2.h(null);
                break;
            case 2:
                lf0 lf0Var3 = this.b;
                ah0 ah0Var = lf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ff0(lf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ff0(lf0Var3, 4));
                ah0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                lf0 lf0Var4 = this.b;
                lf0Var4.O.p0.popup = false;
                lf0Var4.h(null);
                break;
            default:
                lf0 lf0Var5 = this.b;
                lf0Var5.c(true);
                lf0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}

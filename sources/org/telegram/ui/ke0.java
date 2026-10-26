package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ re0 b;

    public /* synthetic */ ke0(re0 re0Var, int i10) {
        this.a = i10;
        this.b = re0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                re0 re0Var = this.b;
                re0Var.c(true);
                re0Var.O.z1(0, true, null, true);
                re0Var.n();
                break;
            case 1:
                re0 re0Var2 = this.b;
                re0Var2.O.p0.popup = false;
                re0Var2.h(null);
                break;
            case 2:
                re0 re0Var3 = this.b;
                gg0 gg0Var = re0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ke0(re0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ke0(re0Var3, 4));
                gg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                re0 re0Var4 = this.b;
                re0Var4.O.p0.popup = false;
                re0Var4.h(null);
                break;
            default:
                re0 re0Var5 = this.b;
                re0Var5.c(true);
                re0Var5.O.z1(0, true, null, true);
                break;
        }
    }
}

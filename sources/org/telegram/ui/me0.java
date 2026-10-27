package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ te0 b;

    public /* synthetic */ me0(te0 te0Var, int i10) {
        this.a = i10;
        this.b = te0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                te0 te0Var = this.b;
                te0Var.c(true);
                te0Var.O.z1(0, true, null, true);
                te0Var.n();
                break;
            case 1:
                te0 te0Var2 = this.b;
                te0Var2.O.q0.popup = false;
                te0Var2.h(null);
                break;
            case 2:
                te0 te0Var3 = this.b;
                ig0 ig0Var = te0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new me0(te0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new me0(te0Var3, 4));
                ig0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                te0 te0Var4 = this.b;
                te0Var4.O.q0.popup = false;
                te0Var4.h(null);
                break;
            default:
                te0 te0Var5 = this.b;
                te0Var5.c(true);
                te0Var5.O.z1(0, true, null, true);
                break;
        }
    }
}

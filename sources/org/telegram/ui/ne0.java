package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ue0 b;

    public /* synthetic */ ne0(ue0 ue0Var, int i10) {
        this.a = i10;
        this.b = ue0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                ue0 ue0Var = this.b;
                ue0Var.c(true);
                ue0Var.O.y1(0, true, null, true);
                ue0Var.n();
                break;
            case 1:
                ue0 ue0Var2 = this.b;
                ue0Var2.O.p0.popup = false;
                ue0Var2.h(null);
                break;
            case 2:
                ue0 ue0Var3 = this.b;
                ig0 ig0Var = ue0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ne0(ue0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ne0(ue0Var3, 4));
                ig0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                ue0 ue0Var4 = this.b;
                ue0Var4.O.p0.popup = false;
                ue0Var4.h(null);
                break;
            default:
                ue0 ue0Var5 = this.b;
                ue0Var5.c(true);
                ue0Var5.O.y1(0, true, null, true);
                break;
        }
    }
}

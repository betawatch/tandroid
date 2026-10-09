package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf0 b;

    public /* synthetic */ af0(gf0 gf0Var, int i10) {
        this.a = i10;
        this.b = gf0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                gf0 gf0Var = this.b;
                gf0Var.c(true);
                gf0Var.O.u1(0, true, null, true);
                gf0Var.o();
                break;
            case 1:
                gf0 gf0Var2 = this.b;
                gf0Var2.O.p0.popup = false;
                gf0Var2.h(null);
                break;
            case 2:
                gf0 gf0Var3 = this.b;
                wg0 wg0Var = gf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new af0(gf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new af0(gf0Var3, 4));
                wg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                gf0 gf0Var4 = this.b;
                gf0Var4.O.p0.popup = false;
                gf0Var4.h(null);
                break;
            default:
                gf0 gf0Var5 = this.b;
                gf0Var5.c(true);
                gf0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}

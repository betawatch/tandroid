package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ne0 b;

    public /* synthetic */ he0(ne0 ne0Var, int i10) {
        this.a = i10;
        this.b = ne0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ne0 ne0Var = this.b;
                ne0Var.c(true);
                ne0Var.O.u1(0, true, null, true);
                ne0Var.o();
                break;
            case 1:
                ne0 ne0Var2 = this.b;
                ne0Var2.O.p0.popup = false;
                ne0Var2.h(null);
                break;
            case 2:
                ne0 ne0Var3 = this.b;
                dg0 dg0Var = ne0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new he0(ne0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new he0(ne0Var3, 4));
                dg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                ne0 ne0Var4 = this.b;
                ne0Var4.O.p0.popup = false;
                ne0Var4.h(null);
                break;
            default:
                ne0 ne0Var5 = this.b;
                ne0Var5.c(true);
                ne0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}

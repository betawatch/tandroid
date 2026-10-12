package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf0 b;

    public /* synthetic */ gf0(mf0 mf0Var, int i10) {
        this.a = i10;
        this.b = mf0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                mf0 mf0Var = this.b;
                mf0Var.c(true);
                mf0Var.O.u1(0, true, null, true);
                mf0Var.o();
                break;
            case 1:
                mf0 mf0Var2 = this.b;
                mf0Var2.O.p0.popup = false;
                mf0Var2.h(null);
                break;
            case 2:
                mf0 mf0Var3 = this.b;
                bh0 bh0Var = mf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bh0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new gf0(mf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new gf0(mf0Var3, 4));
                bh0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                mf0 mf0Var4 = this.b;
                mf0Var4.O.p0.popup = false;
                mf0Var4.h(null);
                break;
            default:
                mf0 mf0Var5 = this.b;
                mf0Var5.c(true);
                mf0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}

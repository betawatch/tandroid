package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf0 b;

    public /* synthetic */ bf0(hf0 hf0Var, int i10) {
        this.a = i10;
        this.b = hf0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                hf0 hf0Var = this.b;
                hf0Var.c(true);
                hf0Var.O.u1(0, true, null, true);
                hf0Var.o();
                break;
            case 1:
                hf0 hf0Var2 = this.b;
                hf0Var2.O.p0.popup = false;
                hf0Var2.h(null);
                break;
            case 2:
                hf0 hf0Var3 = this.b;
                xg0 xg0Var = hf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new bf0(hf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new bf0(hf0Var3, 4));
                xg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                hf0 hf0Var4 = this.b;
                hf0Var4.O.p0.popup = false;
                hf0Var4.h(null);
                break;
            default:
                hf0 hf0Var5 = this.b;
                hf0Var5.c(true);
                hf0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}

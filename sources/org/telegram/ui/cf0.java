package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ if0 b;

    public /* synthetic */ cf0(if0 if0Var, int i10) {
        this.a = i10;
        this.b = if0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                if0 if0Var = this.b;
                if0Var.c(true);
                if0Var.O.u1(0, true, null, true);
                if0Var.o();
                break;
            case 1:
                if0 if0Var2 = this.b;
                if0Var2.O.p0.popup = false;
                if0Var2.h(null);
                break;
            case 2:
                if0 if0Var3 = this.b;
                xg0 xg0Var = if0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new cf0(if0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new cf0(if0Var3, 4));
                xg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                if0 if0Var4 = this.b;
                if0Var4.O.p0.popup = false;
                if0Var4.h(null);
                break;
            default:
                if0 if0Var5 = this.b;
                if0Var5.c(true);
                if0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}

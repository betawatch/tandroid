package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class df0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;

    public /* synthetic */ df0(jf0 jf0Var, int i10) {
        this.a = i10;
        this.b = jf0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                jf0 jf0Var = this.b;
                jf0Var.c(true);
                jf0Var.O.u1(0, true, null, true);
                jf0Var.o();
                break;
            case 1:
                jf0 jf0Var2 = this.b;
                jf0Var2.O.p0.popup = false;
                jf0Var2.h(null);
                break;
            case 2:
                jf0 jf0Var3 = this.b;
                yg0 yg0Var = jf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new df0(jf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new df0(jf0Var3, 4));
                yg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                jf0 jf0Var4 = this.b;
                jf0Var4.O.p0.popup = false;
                jf0Var4.h(null);
                break;
            default:
                jf0 jf0Var5 = this.b;
                jf0Var5.c(true);
                jf0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}

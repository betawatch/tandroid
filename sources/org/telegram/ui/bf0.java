package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf0 b;

    public /* synthetic */ bf0(hf0 hf0Var, int i10) {
        this.a = i10;
        this.b = hf0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                wg0 wg0Var = hf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new bf0(hf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new bf0(hf0Var3, 4));
                wg0Var.showDialog(alertDialog$Builder.a);
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

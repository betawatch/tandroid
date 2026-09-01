package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i01 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k01 b;

    public /* synthetic */ i01(k01 k01Var, int i10) {
        this.a = i10;
        this.b = k01Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                k01 k01Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k01Var.getContext());
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new i01(k01Var, 2));
                l.d.u(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                k01 k01Var2 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(k01Var2.getContext(), 3, null);
                d2Var2.d0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(k01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.lo(16, k01Var2, d2Var2));
                d2Var2.show();
                break;
        }
    }
}

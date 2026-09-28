package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s01 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u01 b;

    public /* synthetic */ s01(u01 u01Var, int i10) {
        this.a = i10;
        this.b = u01Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                u01 u01Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u01Var.getContext());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new s01(u01Var, 2));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                u01 u01Var2 = this.b;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(u01Var2.getContext(), 3, null);
                a2Var2.g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(u01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.lo(16, u01Var2, a2Var2));
                a2Var2.show();
                break;
        }
    }
}

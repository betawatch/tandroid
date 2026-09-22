package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class t01 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v01 b;

    public /* synthetic */ t01(v01 v01Var, int i10) {
        this.a = i10;
        this.b = v01Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                v01 v01Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v01Var.getContext());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new t01(v01Var, 2));
                hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                v01 v01Var2 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(v01Var2.getContext(), 3, null);
                b2Var2.g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(v01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.oo(16, v01Var2, b2Var2));
                b2Var2.show();
                break;
        }
    }
}

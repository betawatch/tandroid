package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h01 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j01 b;

    public /* synthetic */ h01(j01 j01Var, int i10) {
        this.a = i10;
        this.b = j01Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                j01 j01Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j01Var.getContext());
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new h01(j01Var, 2));
                kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                j01 j01Var2 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(j01Var2.getContext(), 3, null);
                d2Var2.d0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(j01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.no(16, j01Var2, d2Var2));
                d2Var2.show();
                break;
        }
    }
}

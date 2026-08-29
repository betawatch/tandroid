package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz0 b;

    public /* synthetic */ wz0(yz0 yz0Var, int i10) {
        this.a = i10;
        this.b = yz0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                yz0 yz0Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yz0Var.getContext());
                alertDialog$Builder.a.P = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new wz0(yz0Var, 2));
                j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                yz0 yz0Var2 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(yz0Var2.getContext(), 3, null);
                c2Var2.c0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(yz0Var2.d).sendRequest(deleteaccount, new org.telegram.ui.zg(19, yz0Var2, c2Var2));
                c2Var2.show();
                break;
        }
    }
}

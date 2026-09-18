package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e01 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g01 b;

    public /* synthetic */ e01(g01 g01Var, int i10) {
        this.a = i10;
        this.b = g01Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                g01 g01Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g01Var.getContext());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new e01(g01Var, 2));
                hg.k0.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                g01 g01Var2 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(g01Var2.getContext(), 3, null);
                c2Var2.g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(g01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.qo(16, g01Var2, c2Var2));
                c2Var2.show();
                break;
        }
    }
}

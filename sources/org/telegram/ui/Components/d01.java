package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d01 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f01 b;

    public /* synthetic */ d01(f01 f01Var, int i10) {
        this.a = i10;
        this.b = f01Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                f01 f01Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f01Var.getContext());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new d01(f01Var, 2));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                f01 f01Var2 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(f01Var2.getContext(), 3, null);
                b2Var2.g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(f01Var2.d).sendRequest(deleteaccount, new org.telegram.ui.qo(16, f01Var2, b2Var2));
                b2Var2.show();
                break;
        }
    }
}

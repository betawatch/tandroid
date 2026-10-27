package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o11 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q11 b;

    public /* synthetic */ o11(q11 q11Var, int i10) {
        this.a = i10;
        this.b = q11Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                q11 q11Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q11Var.getContext());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new o11(q11Var, 2));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                q11 q11Var2 = this.b;
                org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(q11Var2.getContext(), 3, null);
                e2Var2.i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(q11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.z7(24, q11Var2, e2Var2));
                e2Var2.show();
                break;
        }
    }
}

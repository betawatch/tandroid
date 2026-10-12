package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class e11 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;

    public /* synthetic */ e11(g11 g11Var, int i10) {
        this.a = i10;
        this.b = g11Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                g11 g11Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var.getContext());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new e11(g11Var, 2));
                org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                g11 g11Var2 = this.b;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(g11Var2.getContext(), 3, null);
                a2Var2.g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(g11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.to(16, g11Var2, a2Var2));
                a2Var2.show();
                break;
        }
    }
}

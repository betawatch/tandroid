package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c11 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e11 b;

    public /* synthetic */ c11(e11 e11Var, int i10) {
        this.a = i10;
        this.b = e11Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                e11 e11Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e11Var.getContext());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new c11(e11Var, 2));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                e11 e11Var2 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(e11Var2.getContext(), 3, null);
                b2Var2.g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(e11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.no(16, e11Var2, b2Var2));
                b2Var2.show();
                break;
        }
    }
}

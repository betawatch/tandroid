package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz0 b;

    public /* synthetic */ kz0(mz0 mz0Var, int i9) {
        this.a = i9;
        this.b = mz0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                mz0 mz0Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mz0Var.getContext());
                alertDialog$Builder.a.P = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new kz0(mz0Var, 2));
                j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                mz0 mz0Var2 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(mz0Var2.getContext(), 3, null);
                c2Var2.c0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(mz0Var2.d).sendRequest(deleteaccount, new org.telegram.ui.rc(23, mz0Var2, c2Var2));
                c2Var2.show();
                break;
        }
    }
}

package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mz0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz0 b;

    public /* synthetic */ mz0(oz0 oz0Var, int i10) {
        this.a = i10;
        this.b = oz0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                oz0 oz0Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oz0Var.getContext());
                alertDialog$Builder.a.P = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new mz0(oz0Var, 2));
                i0.a.w(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                oz0 oz0Var2 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(oz0Var2.getContext(), 3, null);
                b2Var2.c0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(oz0Var2.d).sendRequest(deleteaccount, new org.telegram.ui.gg(20, oz0Var2, b2Var2));
                b2Var2.show();
                break;
        }
    }
}

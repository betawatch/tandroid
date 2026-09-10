package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class p01 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s01 b;

    public /* synthetic */ p01(s01 s01Var, int i10) {
        this.a = i10;
        this.b = s01Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                s01 s01Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s01Var.getContext());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new p01(s01Var, 2));
                hc.b.s(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                s01 s01Var2 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(s01Var2.getContext(), 3, null);
                d2Var2.g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(s01Var2.d).sendRequest(deleteaccount, new th(11, s01Var2, d2Var2));
                d2Var2.show();
                break;
        }
    }
}

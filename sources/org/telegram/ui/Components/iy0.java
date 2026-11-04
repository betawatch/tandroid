package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy0 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ky0 b;

    public /* synthetic */ iy0(ky0 ky0Var, int i3) {
        this.a = i3;
        this.b = ky0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.a;
        ky0 ky0Var = this.b;
        switch (i10) {
            case 0:
                ky0Var.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ky0Var.getContext());
                String M0 = org.telegram.messenger.bd.M0(2131743986, null);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                s1Var2.U = M0;
                s1Var2.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751653, null), new iy0(ky0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, ky0Var.getContext(), null);
                s1Var3.j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(ky0Var.d).sendRequest(deleteaccount, new org.telegram.ui.ActionBar.h6(25, ky0Var, s1Var3));
                s1Var3.show();
                break;
        }
    }
}

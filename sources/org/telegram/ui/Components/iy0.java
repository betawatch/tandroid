package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ky0 b;

    public /* synthetic */ iy0(ky0 ky0Var, int i7) {
        this.a = i7;
        this.b = ky0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.a;
        ky0 ky0Var = this.b;
        switch (i10) {
            case 0:
                ky0Var.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ky0Var.getContext());
                String M0 = org.telegram.messenger.hd.M0(2131743977, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.T = M0;
                u1Var2.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751653, null), new iy0(ky0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, ky0Var.getContext(), null);
                u1Var3.i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(ky0Var.d).sendRequest(deleteaccount, new org.telegram.ui.ld(22, ky0Var, u1Var3));
                u1Var3.show();
                break;
        }
    }
}

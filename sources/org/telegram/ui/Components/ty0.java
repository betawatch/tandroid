package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ty0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vy0 b;

    public /* synthetic */ ty0(vy0 vy0Var, int i7) {
        this.a = i7;
        this.b = vy0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.a;
        vy0 vy0Var = this.b;
        switch (i10) {
            case 0:
                vy0Var.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vy0Var.getContext());
                String N0 = org.telegram.messenger.gd.N0(2131743729, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.U = N0;
                t1Var2.S = org.telegram.messenger.gd.N0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751640, null), new ty0(vy0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, vy0Var.getContext(), null);
                t1Var3.j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(vy0Var.d).sendRequest(deleteaccount, new org.telegram.ui.v7(24, vy0Var, t1Var3));
                t1Var3.show();
                break;
        }
    }
}

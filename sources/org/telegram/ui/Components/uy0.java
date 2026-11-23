package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy0 b;

    public /* synthetic */ uy0(wy0 wy0Var, int i7) {
        this.a = i7;
        this.b = wy0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.a;
        wy0 wy0Var = this.b;
        switch (i10) {
            case 0:
                wy0Var.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wy0Var.getContext());
                String N0 = org.telegram.messenger.hd.N0(2131743731, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.U = N0;
                t1Var2.S = org.telegram.messenger.hd.N0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751640, null), new uy0(wy0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, wy0Var.getContext(), null);
                t1Var3.j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(wy0Var.d).sendRequest(deleteaccount, new org.telegram.ui.u7(24, wy0Var, t1Var3));
                t1Var3.show();
                break;
        }
    }
}

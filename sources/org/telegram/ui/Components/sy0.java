package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sy0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy0 b;

    public /* synthetic */ sy0(uy0 uy0Var, int i7) {
        this.a = i7;
        this.b = uy0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.a;
        uy0 uy0Var = this.b;
        switch (i10) {
            case 0:
                uy0Var.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uy0Var.getContext());
                String M0 = org.telegram.messenger.gd.M0(2131743739, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.U = M0;
                u1Var2.S = org.telegram.messenger.gd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751641, null), new sy0(uy0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, uy0Var.getContext(), null);
                u1Var3.j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(uy0Var.d).sendRequest(deleteaccount, new org.telegram.ui.u7(24, uy0Var, u1Var3));
                u1Var3.show();
                break;
        }
    }
}

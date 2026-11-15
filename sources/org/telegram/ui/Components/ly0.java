package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny0 b;

    public /* synthetic */ ly0(ny0 ny0Var, int i7) {
        this.a = i7;
        this.b = ny0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.a;
        ny0 ny0Var = this.b;
        switch (i10) {
            case 0:
                ny0Var.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ny0Var.getContext());
                String M0 = org.telegram.messenger.hd.M0(2131743976, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.U = M0;
                t1Var2.S = org.telegram.messenger.hd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751652, null), new ly0(ny0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, ny0Var.getContext(), null);
                t1Var3.j0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(ny0Var.d).sendRequest(deleteaccount, new org.telegram.ui.v7(24, ny0Var, t1Var3));
                t1Var3.show();
                break;
        }
    }
}

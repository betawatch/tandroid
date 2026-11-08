package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly0 b;

    public /* synthetic */ jy0(ly0 ly0Var, int i7) {
        this.a = i7;
        this.b = ly0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.a;
        ly0 ly0Var = this.b;
        switch (i10) {
            case 0:
                ly0Var.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ly0Var.getContext());
                String M0 = org.telegram.messenger.id.M0(2131743979, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.T = M0;
                u1Var2.R = org.telegram.messenger.id.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751653, null), new jy0(ly0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, ly0Var.getContext(), null);
                u1Var3.i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(ly0Var.d).sendRequest(deleteaccount, new org.telegram.ui.ld(22, ly0Var, u1Var3));
                u1Var3.show();
                break;
        }
    }
}

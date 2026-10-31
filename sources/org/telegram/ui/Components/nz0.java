package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz0 b;

    public /* synthetic */ nz0(pz0 pz0Var, int i10) {
        this.a = i10;
        this.b = pz0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.a;
        pz0 pz0Var = this.b;
        switch (i11) {
            case 0:
                pz0Var.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pz0Var.getContext());
                String L0 = org.telegram.messenger.cd.L0(2131744001, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                x1Var2.T = L0;
                x1Var2.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751653, null), new nz0(pz0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, pz0Var.getContext(), null);
                x1Var3.i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(pz0Var.d).sendRequest(deleteaccount, new t20(6, pz0Var, x1Var3));
                x1Var3.show();
                break;
        }
    }
}

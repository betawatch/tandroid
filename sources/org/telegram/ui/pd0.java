package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd0 b;

    public /* synthetic */ pd0(wd0 wd0Var, int i10) {
        this.a = i10;
        this.b = wd0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.a;
        wd0 wd0Var = this.b;
        switch (i11) {
            case 0:
                wd0Var.c(true);
                wd0Var.O.C1(0, true, null, true);
                wd0Var.n();
                break;
            case 1:
                wd0Var.O.q0.popup = false;
                wd0Var.h(null);
                break;
            case 2:
                hf0 hf0Var = wd0Var.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131744223, "TermsOfService");
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                x1Var2.R = L0;
                x1Var2.T = org.telegram.messenger.cd.L0(2131744002, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745338, "SignUp"), new pd0(wd0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751605, "Decline"), new pd0(wd0Var, 4));
                hf0Var.showDialog(x1Var2);
                break;
            case 3:
                wd0Var.O.q0.popup = false;
                wd0Var.h(null);
                break;
            default:
                wd0Var.c(true);
                wd0Var.O.C1(0, true, null, true);
                break;
        }
    }
}

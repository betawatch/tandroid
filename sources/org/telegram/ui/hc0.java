package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc0 b;

    public /* synthetic */ hc0(oc0 oc0Var, int i7) {
        this.a = i7;
        this.b = oc0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.a;
        oc0 oc0Var = this.b;
        switch (i10) {
            case 0:
                oc0Var.c(true);
                oc0Var.Q.M1(0, true, null, true);
                oc0Var.n();
                break;
            case 1:
                oc0Var.Q.s0.popup = false;
                oc0Var.h(null);
                break;
            case 2:
                de0 de0Var = oc0Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131743953, "TermsOfService");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.S = N0;
                t1Var2.U = org.telegram.messenger.gd.N0(2131743730, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745124, "SignUp"), new hc0(oc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751592, "Decline"), new hc0(oc0Var, 4));
                de0Var.showDialog(t1Var2);
                break;
            case 3:
                oc0Var.Q.s0.popup = false;
                oc0Var.h(null);
                break;
            default:
                oc0Var.c(true);
                oc0Var.Q.M1(0, true, null, true);
                break;
        }
    }
}

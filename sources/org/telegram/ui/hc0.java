package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc0 b;

    public /* synthetic */ hc0(oc0 oc0Var, int i7) {
        this.a = i7;
        this.b = oc0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
                ce0 ce0Var = oc0Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131744198, "TermsOfService");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.S = M0;
                t1Var2.U = org.telegram.messenger.hd.M0(2131743977, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745320, "SignUp"), new hc0(oc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751604, "Decline"), new hc0(oc0Var, 4));
                ce0Var.showDialog(t1Var2);
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

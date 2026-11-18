package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ ic0(pc0 pc0Var, int i7) {
        this.a = i7;
        this.b = pc0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.a;
        pc0 pc0Var = this.b;
        switch (i10) {
            case 0:
                pc0Var.c(true);
                pc0Var.Q.M1(0, true, null, true);
                pc0Var.n();
                break;
            case 1:
                pc0Var.Q.s0.popup = false;
                pc0Var.h(null);
                break;
            case 2:
                ee0 ee0Var = pc0Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131743963, "TermsOfService");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.S = M0;
                u1Var2.U = org.telegram.messenger.gd.M0(2131743740, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745125, "SignUp"), new ic0(pc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751593, "Decline"), new ic0(pc0Var, 4));
                ee0Var.showDialog(u1Var2);
                break;
            case 3:
                pc0Var.Q.s0.popup = false;
                pc0Var.h(null);
                break;
            default:
                pc0Var.c(true);
                pc0Var.Q.M1(0, true, null, true);
                break;
        }
    }
}

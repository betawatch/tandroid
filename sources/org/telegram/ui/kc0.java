package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc0 b;

    public /* synthetic */ kc0(rc0 rc0Var, int i7) {
        this.a = i7;
        this.b = rc0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.a;
        rc0 rc0Var = this.b;
        switch (i10) {
            case 0:
                rc0Var.c(true);
                rc0Var.P.M1(0, true, null, true);
                rc0Var.n();
                break;
            case 1:
                rc0Var.P.q0.popup = false;
                rc0Var.h(null);
                break;
            case 2:
                ee0 ee0Var = rc0Var.P;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131744198, "TermsOfService");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.R = M0;
                u1Var2.T = org.telegram.messenger.id.M0(2131743977, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745320, "SignUp"), new kc0(rc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751604, "Decline"), new kc0(rc0Var, 4));
                ee0Var.showDialog(u1Var2);
                break;
            case 3:
                rc0Var.P.q0.popup = false;
                rc0Var.h(null);
                break;
            default:
                rc0Var.c(true);
                rc0Var.P.M1(0, true, null, true);
                break;
        }
    }
}

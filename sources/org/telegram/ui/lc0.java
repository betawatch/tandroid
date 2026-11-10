package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc0 b;

    public /* synthetic */ lc0(sc0 sc0Var, int i7) {
        this.a = i7;
        this.b = sc0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.a;
        sc0 sc0Var = this.b;
        switch (i10) {
            case 0:
                sc0Var.c(true);
                sc0Var.P.M1(0, true, null, true);
                sc0Var.n();
                break;
            case 1:
                sc0Var.P.q0.popup = false;
                sc0Var.h(null);
                break;
            case 2:
                fe0 fe0Var = sc0Var.P;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131744198, "TermsOfService");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.R = M0;
                u1Var2.T = org.telegram.messenger.id.M0(2131743977, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745320, "SignUp"), new lc0(sc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751604, "Decline"), new lc0(sc0Var, 4));
                fe0Var.showDialog(u1Var2);
                break;
            case 3:
                sc0Var.P.q0.popup = false;
                sc0Var.h(null);
                break;
            default:
                sc0Var.c(true);
                sc0Var.P.M1(0, true, null, true);
                break;
        }
    }
}

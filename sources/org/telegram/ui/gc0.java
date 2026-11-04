package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc0 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc0 b;

    public /* synthetic */ gc0(nc0 nc0Var, int i3) {
        this.a = i3;
        this.b = nc0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.a;
        nc0 nc0Var = this.b;
        switch (i10) {
            case 0:
                nc0Var.c(true);
                nc0Var.P.D1(0, true, null, true);
                nc0Var.n();
                break;
            case 1:
                nc0Var.P.r0.popup = false;
                nc0Var.h(null);
                break;
            case 2:
                xd0 xd0Var = nc0Var.P;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131744208, "TermsOfService");
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                s1Var2.S = M0;
                s1Var2.U = org.telegram.messenger.bd.M0(2131743987, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745330, "SignUp"), new gc0(nc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751605, "Decline"), new gc0(nc0Var, 4));
                xd0Var.showDialog(s1Var2);
                break;
            case 3:
                nc0Var.P.r0.popup = false;
                nc0Var.h(null);
                break;
            default:
                nc0Var.c(true);
                nc0Var.P.D1(0, true, null, true);
                break;
        }
    }
}

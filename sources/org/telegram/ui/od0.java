package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd0 b;

    public /* synthetic */ od0(vd0 vd0Var, int i10) {
        this.a = i10;
        this.b = vd0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.a;
        vd0 vd0Var = this.b;
        switch (i11) {
            case 0:
                vd0Var.c(true);
                vd0Var.O.D1(0, true, null, true);
                vd0Var.n();
                break;
            case 1:
                vd0Var.O.q0.popup = false;
                vd0Var.h(null);
                break;
            case 2:
                gf0 gf0Var = vd0Var.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131744223, "TermsOfService");
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                x1Var2.R = L0;
                x1Var2.T = org.telegram.messenger.dd.L0(2131744002, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131745338, "SignUp"), new od0(vd0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751605, "Decline"), new od0(vd0Var, 4));
                gf0Var.showDialog(x1Var2);
                break;
            case 3:
                vd0Var.O.q0.popup = false;
                vd0Var.h(null);
                break;
            default:
                vd0Var.c(true);
                vd0Var.O.D1(0, true, null, true);
                break;
        }
    }
}

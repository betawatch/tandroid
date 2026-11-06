package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ ic0(pc0 pc0Var, int i7) {
        this.a = i7;
        this.b = pc0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.a;
        pc0 pc0Var = this.b;
        switch (i10) {
            case 0:
                pc0Var.c(true);
                pc0Var.P.M1(0, true, null, true);
                pc0Var.n();
                break;
            case 1:
                pc0Var.P.q0.popup = false;
                pc0Var.h(null);
                break;
            case 2:
                ce0 ce0Var = pc0Var.P;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131744199, "TermsOfService");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.R = M0;
                u1Var2.T = org.telegram.messenger.hd.M0(2131743978, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745321, "SignUp"), new ic0(pc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751605, "Decline"), new ic0(pc0Var, 4));
                ce0Var.showDialog(u1Var2);
                break;
            case 3:
                pc0Var.P.q0.popup = false;
                pc0Var.h(null);
                break;
            default:
                pc0Var.c(true);
                pc0Var.P.M1(0, true, null, true);
                break;
        }
    }
}

package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ ic0(pc0 pc0Var, int i7) {
        this.a = i7;
        this.b = pc0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
                de0 de0Var = pc0Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131743957, "TermsOfService");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.S = N0;
                t1Var2.U = org.telegram.messenger.gd.N0(2131743734, "TosDecline");
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745124, "SignUp"), new ic0(pc0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751592, "Decline"), new ic0(pc0Var, 4));
                de0Var.showDialog(t1Var2);
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

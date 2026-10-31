package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zt0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ org.telegram.messenger.jj d;
    public final /* synthetic */ int e;

    public /* synthetic */ cq0(zt0 zt0Var, org.telegram.ui.ActionBar.p6 p6Var, int i10, org.telegram.messenger.jj jjVar) {
        this.b = zt0Var;
        this.c = p6Var;
        this.e = i10;
        this.d = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, this.b.getContext(), this.c)};
                int i10 = this.e;
                int w02 = org.telegram.messenger.qz.C(i10).w0(this.d, null, new as(x1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.i0.h3(new nq0(x1VarArr, i10, w02, 0), 500L);
                    break;
                }
                break;
            default:
                zt0 zt0Var = this.b;
                Context context = zt0Var.getContext();
                org.telegram.ui.ActionBar.p6 p6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R0 = false;
                org.telegram.messenger.jj jjVar = this.d;
                if (jjVar.c4()) {
                    x1Var.R = org.telegram.messenger.cd.L0(2131744842, null);
                    x1Var.T = org.telegram.messenger.cd.L0(2131744843, null);
                } else {
                    x1Var.R = org.telegram.messenger.cd.L0(2131744847, null);
                    x1Var.T = org.telegram.messenger.cd.L0(2131744848, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new mg.i0(zt0Var, p6Var, jjVar, this.e, 5));
                i0.a.s(null, 2131752589, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ cq0(zt0 zt0Var, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.jj jjVar, int i10) {
        this.b = zt0Var;
        this.c = p6Var;
        this.d = jjVar;
        this.e = i10;
    }
}

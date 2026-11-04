package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ws0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ org.telegram.messenger.zi d;
    public final /* synthetic */ int e;

    public /* synthetic */ cp0(ws0 ws0Var, org.telegram.ui.ActionBar.e6 e6Var, int i3, org.telegram.messenger.zi ziVar) {
        this.b = ws0Var;
        this.c = e6Var;
        this.e = i3;
        this.d = ziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, this.b.getContext(), this.c)};
                int i3 = this.e;
                int w02 = org.telegram.messenger.yy.C(i3).w0(this.d, null, new qr(s1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.i3(new mp0(s1VarArr, i3, w02, 0), 500L);
                    break;
                }
                break;
            default:
                ws0 ws0Var = this.b;
                Context context = ws0Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S0 = false;
                org.telegram.messenger.zi ziVar = this.d;
                if (ziVar.d4()) {
                    s1Var.S = org.telegram.messenger.bd.M0(2131744834, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131744835, null);
                } else {
                    s1Var.S = org.telegram.messenger.bd.M0(2131744839, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131744840, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new cg.e0(ws0Var, e6Var, ziVar, this.e, 5));
                k2.p1.v(null, 2131752589, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ cp0(ws0 ws0Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.zi ziVar, int i3) {
        this.b = ws0Var;
        this.c = e6Var;
        this.d = ziVar;
        this.e = i3;
    }
}

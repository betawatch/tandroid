package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ au0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ org.telegram.messenger.kj d;
    public final /* synthetic */ int e;

    public /* synthetic */ dq0(au0 au0Var, org.telegram.ui.ActionBar.p6 p6Var, int i10, org.telegram.messenger.kj kjVar) {
        this.b = au0Var;
        this.c = p6Var;
        this.e = i10;
        this.d = kjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, this.b.getContext(), this.c)};
                int i10 = this.e;
                int w02 = org.telegram.messenger.rz.C(i10).w0(this.d, null, new as(x1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.i0.h3(new oq0(x1VarArr, i10, w02, 0), 500L);
                    break;
                }
                break;
            default:
                au0 au0Var = this.b;
                Context context = au0Var.getContext();
                org.telegram.ui.ActionBar.p6 p6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R0 = false;
                org.telegram.messenger.kj kjVar = this.d;
                if (kjVar.c4()) {
                    x1Var.R = org.telegram.messenger.dd.L0(2131744842, null);
                    x1Var.T = org.telegram.messenger.dd.L0(2131744843, null);
                } else {
                    x1Var.R = org.telegram.messenger.dd.L0(2131744847, null);
                    x1Var.T = org.telegram.messenger.dd.L0(2131744848, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131744859, null), new mg.i0(au0Var, p6Var, kjVar, this.e, 5));
                i0.a.s(null, 2131752589, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ dq0(au0 au0Var, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.kj kjVar, int i10) {
        this.b = au0Var;
        this.c = p6Var;
        this.d = kjVar;
        this.e = i10;
    }
}

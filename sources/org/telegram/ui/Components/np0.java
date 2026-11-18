package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class np0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gt0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ org.telegram.messenger.fj d;
    public final /* synthetic */ int e;

    public /* synthetic */ np0(gt0 gt0Var, org.telegram.ui.ActionBar.i6 i6Var, int i7, org.telegram.messenger.fj fjVar) {
        this.b = gt0Var;
        this.c = i6Var;
        this.e = i7;
        this.d = fjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, this.b.getContext(), this.c)};
                int i7 = this.e;
                int w02 = org.telegram.messenger.zy.C(i7).w0(this.d, null, new ds(u1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.h3(new yp0(u1VarArr, i7, w02, 0), 500L);
                    break;
                }
                break;
            default:
                gt0 gt0Var = this.b;
                Context context = gt0Var.getContext();
                org.telegram.ui.ActionBar.i6 i6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.Q0 = false;
                org.telegram.messenger.fj fjVar = this.d;
                if (fjVar.c4()) {
                    u1Var.S = org.telegram.messenger.gd.M0(2131744589, null);
                    u1Var.U = org.telegram.messenger.gd.M0(2131744590, null);
                } else {
                    u1Var.S = org.telegram.messenger.gd.M0(2131744594, null);
                    u1Var.U = org.telegram.messenger.gd.M0(2131744595, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131744606, null), new bg.g0(gt0Var, i6Var, fjVar, this.e, 5));
                i5.c.y(null, 2131752578, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ np0(gt0 gt0Var, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.fj fjVar, int i7) {
        this.b = gt0Var;
        this.c = i6Var;
        this.d = fjVar;
        this.e = i7;
    }
}

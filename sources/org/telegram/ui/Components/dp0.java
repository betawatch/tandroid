package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ys0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ org.telegram.messenger.gj d;
    public final /* synthetic */ int e;

    public /* synthetic */ dp0(ys0 ys0Var, org.telegram.ui.ActionBar.e6 e6Var, int i7, org.telegram.messenger.gj gjVar) {
        this.b = ys0Var;
        this.c = e6Var;
        this.e = i7;
        this.d = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, this.b.getContext(), this.c)};
                int i7 = this.e;
                int w02 = org.telegram.messenger.ez.C(i7).w0(this.d, null, new wr(t1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.i3(new op0(t1VarArr, i7, w02, 0), 500L);
                    break;
                }
                break;
            default:
                ys0 ys0Var = this.b;
                Context context = ys0Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.Q0 = false;
                org.telegram.messenger.gj gjVar = this.d;
                if (gjVar.c4()) {
                    t1Var.S = org.telegram.messenger.hd.M0(2131744824, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131744825, null);
                } else {
                    t1Var.S = org.telegram.messenger.hd.M0(2131744829, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131744830, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744841, null), new bg.f0(ys0Var, e6Var, gjVar, this.e, 5));
                i5.c.x(null, 2131752589, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ dp0(ys0 ys0Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.gj gjVar, int i7) {
        this.b = ys0Var;
        this.c = e6Var;
        this.d = gjVar;
        this.e = i7;
    }
}

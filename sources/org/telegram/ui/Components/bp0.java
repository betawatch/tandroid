package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zs0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ org.telegram.messenger.ij d;
    public final /* synthetic */ int e;

    public /* synthetic */ bp0(zs0 zs0Var, org.telegram.ui.ActionBar.g6 g6Var, int i7, org.telegram.messenger.ij ijVar) {
        this.b = zs0Var;
        this.c = g6Var;
        this.e = i7;
        this.d = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, this.b.getContext(), this.c)};
                int i7 = this.e;
                int w02 = org.telegram.messenger.gz.C(i7).w0(this.d, null, new qr(u1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.i3(new mp0(u1VarArr, i7, w02, 0), 500L);
                    break;
                }
                break;
            default:
                zs0 zs0Var = this.b;
                Context context = zs0Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.P0 = false;
                org.telegram.messenger.ij ijVar = this.d;
                if (ijVar.c4()) {
                    u1Var.R = org.telegram.messenger.id.M0(2131744824, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131744825, null);
                } else {
                    u1Var.R = org.telegram.messenger.id.M0(2131744829, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131744830, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744841, null), new bg.f0(zs0Var, g6Var, ijVar, this.e, 5));
                jg.g.w(null, 2131752589, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ bp0(zs0 zs0Var, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.b = zs0Var;
        this.c = g6Var;
        this.d = ijVar;
        this.e = i7;
    }
}

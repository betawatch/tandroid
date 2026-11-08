package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xs0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.messenger.ij d;
    public final /* synthetic */ int e;

    public /* synthetic */ ap0(xs0 xs0Var, org.telegram.ui.ActionBar.f6 f6Var, int i7, org.telegram.messenger.ij ijVar) {
        this.b = xs0Var;
        this.c = f6Var;
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
                    org.telegram.messenger.g0.i3(new lp0(u1VarArr, i7, w02, 0), 500L);
                    break;
                }
                break;
            default:
                xs0 xs0Var = this.b;
                Context context = xs0Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.P0 = false;
                org.telegram.messenger.ij ijVar = this.d;
                if (ijVar.d4()) {
                    u1Var.R = org.telegram.messenger.id.M0(2131744827, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131744828, null);
                } else {
                    u1Var.R = org.telegram.messenger.id.M0(2131744832, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131744833, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744844, null), new bg.f0(xs0Var, f6Var, ijVar, this.e, 5));
                jg.g.w(null, 2131752589, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ ap0(xs0 xs0Var, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.b = xs0Var;
        this.c = f6Var;
        this.d = ijVar;
        this.e = i7;
    }
}

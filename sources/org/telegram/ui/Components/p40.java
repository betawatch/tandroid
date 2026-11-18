package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r40 b;

    public /* synthetic */ p40(r40 r40Var, int i7) {
        this.a = i7;
        this.b = r40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.e20 e20Var;
        int i7 = this.a;
        r40 r40Var = this.b;
        switch (i7) {
            case 0:
                r40Var.I0.s(false, false);
                break;
            case 1:
                z40 z40Var = r40Var.I0;
                org.telegram.messenger.e20 e20Var2 = new org.telegram.messenger.e20();
                z40Var.S = e20Var2;
                e20Var2.s = true;
                e20Var2.a = -1L;
                e20Var2.b = -1L;
                e20Var2.w = z40Var.M;
                e20Var2.x = z40Var.N;
                e20Var2.y = z40Var.O;
                e20Var2.z = z40Var.P;
                e20Var2.q = Math.max(1L, z40Var.Q);
                org.telegram.messenger.e20 e20Var3 = z40Var.S;
                e20Var3.n = 25;
                e20Var3.h = 360;
                e20Var3.k = 360;
                e20Var3.i = 360;
                e20Var3.l = 360;
                e20Var3.o = z40Var.g0.getAbsolutePath();
                r40Var.h(z40Var.g0);
                z40Var.S.r = z40Var.k0;
                org.telegram.messenger.ks.f(z40Var.e).k(org.telegram.messenger.ks.s2, Integer.valueOf(z40Var.V), z40Var.S, z40Var.g0.getAbsolutePath(), r40Var.B0);
                break;
            case 2:
                if (r40Var.H0 && (e20Var = r40Var.I0.S) != null) {
                    e20Var.P = false;
                }
                r40Var.c(r40Var.a, 0L, true);
                MediaController.B().Y(false);
                break;
            case 3:
                r40Var.I0.i1 = null;
                break;
            case 4:
                r40Var.I0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                r40Var.I0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}

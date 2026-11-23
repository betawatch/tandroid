package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        org.telegram.messenger.d20 d20Var;
        int i7 = this.a;
        r40 r40Var = this.b;
        switch (i7) {
            case 0:
                r40Var.I0.s(false, false);
                break;
            case 1:
                z40 z40Var = r40Var.I0;
                org.telegram.messenger.d20 d20Var2 = new org.telegram.messenger.d20();
                z40Var.S = d20Var2;
                d20Var2.s = true;
                d20Var2.a = -1L;
                d20Var2.b = -1L;
                d20Var2.w = z40Var.M;
                d20Var2.x = z40Var.N;
                d20Var2.y = z40Var.O;
                d20Var2.z = z40Var.P;
                d20Var2.q = Math.max(1L, z40Var.Q);
                org.telegram.messenger.d20 d20Var3 = z40Var.S;
                d20Var3.n = 25;
                d20Var3.h = 360;
                d20Var3.k = 360;
                d20Var3.i = 360;
                d20Var3.l = 360;
                d20Var3.o = z40Var.g0.getAbsolutePath();
                r40Var.h(z40Var.g0);
                z40Var.S.r = z40Var.k0;
                org.telegram.messenger.ks.f(z40Var.e).k(org.telegram.messenger.ks.s2, Integer.valueOf(z40Var.V), z40Var.S, z40Var.g0.getAbsolutePath(), r40Var.B0);
                break;
            case 2:
                if (r40Var.H0 && (d20Var = r40Var.I0.S) != null) {
                    d20Var.P = false;
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

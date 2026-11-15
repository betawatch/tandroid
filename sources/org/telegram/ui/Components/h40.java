package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j40 b;

    public /* synthetic */ h40(j40 j40Var, int i7) {
        this.a = i7;
        this.b = j40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.g20 g20Var;
        int i7 = this.a;
        j40 j40Var = this.b;
        switch (i7) {
            case 0:
                j40Var.I0.s(false, false);
                break;
            case 1:
                r40 r40Var = j40Var.I0;
                org.telegram.messenger.g20 g20Var2 = new org.telegram.messenger.g20();
                r40Var.S = g20Var2;
                g20Var2.s = true;
                g20Var2.a = -1L;
                g20Var2.b = -1L;
                g20Var2.w = r40Var.M;
                g20Var2.x = r40Var.N;
                g20Var2.y = r40Var.O;
                g20Var2.z = r40Var.P;
                g20Var2.q = Math.max(1L, r40Var.Q);
                org.telegram.messenger.g20 g20Var3 = r40Var.S;
                g20Var3.n = 25;
                g20Var3.h = 360;
                g20Var3.k = 360;
                g20Var3.i = 360;
                g20Var3.l = 360;
                g20Var3.o = r40Var.g0.getAbsolutePath();
                j40Var.h(r40Var.g0);
                r40Var.S.r = r40Var.k0;
                org.telegram.messenger.ns.f(r40Var.e).k(org.telegram.messenger.ns.s2, Integer.valueOf(r40Var.V), r40Var.S, r40Var.g0.getAbsolutePath(), j40Var.B0);
                break;
            case 2:
                if (j40Var.H0 && (g20Var = j40Var.I0.S) != null) {
                    g20Var.P = false;
                }
                j40Var.c(j40Var.a, 0L, true);
                MediaController.B().Y(false);
                break;
            case 3:
                j40Var.I0.i1 = null;
                break;
            case 4:
                j40Var.I0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                j40Var.I0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}

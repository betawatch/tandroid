package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ a40(c40 c40Var, int i3) {
        this.a = i3;
        this.b = c40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.b20 b20Var;
        int i3 = this.a;
        c40 c40Var = this.b;
        switch (i3) {
            case 0:
                c40Var.I0.r(false, false);
                break;
            case 1:
                k40 k40Var = c40Var.I0;
                org.telegram.messenger.b20 b20Var2 = new org.telegram.messenger.b20();
                k40Var.S = b20Var2;
                b20Var2.s = true;
                b20Var2.a = -1L;
                b20Var2.b = -1L;
                b20Var2.w = k40Var.M;
                b20Var2.x = k40Var.N;
                b20Var2.y = k40Var.O;
                b20Var2.z = k40Var.P;
                b20Var2.q = Math.max(1L, k40Var.Q);
                org.telegram.messenger.b20 b20Var3 = k40Var.S;
                b20Var3.n = 25;
                b20Var3.h = 360;
                b20Var3.k = 360;
                b20Var3.i = 360;
                b20Var3.l = 360;
                b20Var3.o = k40Var.g0.getAbsolutePath();
                c40Var.h(k40Var.g0);
                k40Var.S.r = k40Var.k0;
                org.telegram.messenger.hs.f(k40Var.e).k(org.telegram.messenger.hs.s2, Integer.valueOf(k40Var.V), k40Var.S, k40Var.g0.getAbsolutePath(), c40Var.B0);
                break;
            case 2:
                if (c40Var.H0 && (b20Var = c40Var.I0.S) != null) {
                    b20Var.P = false;
                }
                c40Var.c(c40Var.a, 0L, true);
                MediaController.B().Y(false);
                break;
            case 3:
                c40Var.I0.i1 = null;
                break;
            case 4:
                c40Var.I0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                c40Var.I0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}

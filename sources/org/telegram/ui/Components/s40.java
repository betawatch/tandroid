package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u40 b;

    public /* synthetic */ s40(u40 u40Var, int i7) {
        this.a = i7;
        this.b = u40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.f20 f20Var;
        int i7 = this.a;
        u40 u40Var = this.b;
        switch (i7) {
            case 0:
                u40Var.I0.s(false, false);
                break;
            case 1:
                c50 c50Var = u40Var.I0;
                org.telegram.messenger.f20 f20Var2 = new org.telegram.messenger.f20();
                c50Var.S = f20Var2;
                f20Var2.s = true;
                f20Var2.a = -1L;
                f20Var2.b = -1L;
                f20Var2.w = c50Var.M;
                f20Var2.x = c50Var.N;
                f20Var2.y = c50Var.O;
                f20Var2.z = c50Var.P;
                f20Var2.q = Math.max(1L, c50Var.Q);
                org.telegram.messenger.f20 f20Var3 = c50Var.S;
                f20Var3.n = 25;
                f20Var3.h = 360;
                f20Var3.k = 360;
                f20Var3.i = 360;
                f20Var3.l = 360;
                f20Var3.o = c50Var.g0.getAbsolutePath();
                u40Var.h(c50Var.g0);
                c50Var.S.r = c50Var.k0;
                org.telegram.messenger.ls.f(c50Var.e).k(org.telegram.messenger.ls.s2, Integer.valueOf(c50Var.V), c50Var.S, c50Var.g0.getAbsolutePath(), u40Var.B0);
                break;
            case 2:
                if (u40Var.H0 && (f20Var = u40Var.I0.S) != null) {
                    f20Var.P = false;
                }
                u40Var.c(u40Var.a, 0L, true);
                MediaController.B().Y(false);
                break;
            case 3:
                u40Var.I0.i1 = null;
                break;
            case 4:
                u40Var.I0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                u40Var.I0.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}

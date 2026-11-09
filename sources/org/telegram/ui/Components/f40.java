package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h40 b;

    public /* synthetic */ f40(h40 h40Var, int i7) {
        this.a = i7;
        this.b = h40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.j20 j20Var;
        int i7 = this.a;
        h40 h40Var = this.b;
        switch (i7) {
            case 0:
                h40Var.H0.s(false, false);
                break;
            case 1:
                p40 p40Var = h40Var.H0;
                org.telegram.messenger.j20 j20Var2 = new org.telegram.messenger.j20();
                p40Var.R = j20Var2;
                j20Var2.s = true;
                j20Var2.a = -1L;
                j20Var2.b = -1L;
                j20Var2.w = p40Var.L;
                j20Var2.x = p40Var.M;
                j20Var2.y = p40Var.N;
                j20Var2.z = p40Var.O;
                j20Var2.q = Math.max(1L, p40Var.P);
                org.telegram.messenger.j20 j20Var3 = p40Var.R;
                j20Var3.n = 25;
                j20Var3.h = 360;
                j20Var3.k = 360;
                j20Var3.i = 360;
                j20Var3.l = 360;
                j20Var3.o = p40Var.f0.getAbsolutePath();
                h40Var.h(p40Var.f0);
                p40Var.R.r = p40Var.j0;
                org.telegram.messenger.qs.f(p40Var.e).k(org.telegram.messenger.qs.s2, Integer.valueOf(p40Var.U), p40Var.R, p40Var.f0.getAbsolutePath(), h40Var.A0);
                break;
            case 2:
                if (h40Var.G0 && (j20Var = h40Var.H0.R) != null) {
                    j20Var.P = false;
                }
                h40Var.c(h40Var.a, 0L, true);
                MediaController.B().Y(false);
                break;
            case 3:
                h40Var.H0.h1 = null;
                break;
            case 4:
                h40Var.H0.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                h40Var.H0.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}

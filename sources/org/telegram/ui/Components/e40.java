package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g40 b;

    public /* synthetic */ e40(g40 g40Var, int i7) {
        this.a = i7;
        this.b = g40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.j20 j20Var;
        int i7 = this.a;
        g40 g40Var = this.b;
        switch (i7) {
            case 0:
                g40Var.H0.r(false, false);
                break;
            case 1:
                o40 o40Var = g40Var.H0;
                org.telegram.messenger.j20 j20Var2 = new org.telegram.messenger.j20();
                o40Var.R = j20Var2;
                j20Var2.s = true;
                j20Var2.a = -1L;
                j20Var2.b = -1L;
                j20Var2.w = o40Var.L;
                j20Var2.x = o40Var.M;
                j20Var2.y = o40Var.N;
                j20Var2.z = o40Var.O;
                j20Var2.q = Math.max(1L, o40Var.P);
                org.telegram.messenger.j20 j20Var3 = o40Var.R;
                j20Var3.n = 25;
                j20Var3.h = 360;
                j20Var3.k = 360;
                j20Var3.i = 360;
                j20Var3.l = 360;
                j20Var3.o = o40Var.f0.getAbsolutePath();
                g40Var.h(o40Var.f0);
                o40Var.R.r = o40Var.j0;
                org.telegram.messenger.qs.f(o40Var.e).k(org.telegram.messenger.qs.s2, Integer.valueOf(o40Var.U), o40Var.R, o40Var.f0.getAbsolutePath(), g40Var.A0);
                break;
            case 2:
                if (g40Var.G0 && (j20Var = g40Var.H0.R) != null) {
                    j20Var.P = false;
                }
                g40Var.c(g40Var.a, 0L, true);
                MediaController.B().Y(false);
                break;
            case 3:
                g40Var.H0.h1 = null;
                break;
            case 4:
                g40Var.H0.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                g40Var.H0.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}

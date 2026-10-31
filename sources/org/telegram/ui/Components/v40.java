package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x40 b;

    public /* synthetic */ v40(x40 x40Var, int i10) {
        this.a = i10;
        this.b = x40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.x20 x20Var;
        int i10 = this.a;
        x40 x40Var = this.b;
        switch (i10) {
            case 0:
                x40Var.H0.r(false, false);
                break;
            case 1:
                e50 e50Var = x40Var.H0;
                org.telegram.messenger.x20 x20Var2 = new org.telegram.messenger.x20();
                e50Var.R = x20Var2;
                x20Var2.s = true;
                x20Var2.a = -1L;
                x20Var2.b = -1L;
                x20Var2.w = e50Var.L;
                x20Var2.x = e50Var.M;
                x20Var2.y = e50Var.N;
                x20Var2.z = e50Var.O;
                x20Var2.q = Math.max(1L, e50Var.P);
                org.telegram.messenger.x20 x20Var3 = e50Var.R;
                x20Var3.n = 25;
                x20Var3.h = 360;
                x20Var3.k = 360;
                x20Var3.i = 360;
                x20Var3.l = 360;
                x20Var3.o = e50Var.f0.getAbsolutePath();
                x40Var.h(e50Var.f0);
                e50Var.R.r = e50Var.j0;
                org.telegram.messenger.zs.f(e50Var.e).k(org.telegram.messenger.zs.s2, Integer.valueOf(e50Var.U), e50Var.R, e50Var.f0.getAbsolutePath(), x40Var.A0);
                break;
            case 2:
                if (x40Var.G0 && (x20Var = x40Var.H0.R) != null) {
                    x20Var.P = false;
                }
                x40Var.c(x40Var.a, 0L, true);
                MediaController.B().Y(false);
                break;
            case 3:
                x40Var.H0.h1 = null;
                break;
            case 4:
                x40Var.H0.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                x40Var.H0.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}

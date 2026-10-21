package org.telegram.ui.Wallet;

import org.telegram.ui.lc0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t7 b;

    public /* synthetic */ l7(t7 t7Var, int i10) {
        this.a = i10;
        this.b = t7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g7 j10;
        switch (this.a) {
            case 0:
                t7 t7Var = this.b;
                t7Var.s0 = false;
                t7Var.g0 = null;
                t7Var.f0();
                break;
            case 1:
                this.b.Q();
                break;
            case 2:
                t7 t7Var2 = this.b;
                s7 s7Var = t7Var2.g0;
                if (s7Var != null && !t7Var2.m0) {
                    if (!t7Var2.u0) {
                        if (t7Var2.p0 && (j10 = t7Var2.j(s7Var)) != null) {
                            t7Var2.S(j10);
                            break;
                        }
                    } else {
                        t7Var2.n0 = true;
                        t7Var2.h0 = s7Var;
                        t7Var2.B0 = Float.NaN;
                        t7Var2.E0 = Float.NaN;
                        t7Var2.C0 = 0.0f;
                        t7Var2.L0 = false;
                        t7Var2.D0 = s7Var.i.b;
                        s7Var.q.a(0.0f);
                        s7 s7Var2 = t7Var2.g0;
                        r7 r7Var = s7Var2.l;
                        r7Var.d = 260.0f;
                        r7Var.e = 0.58f;
                        r7Var.b = 1.0f;
                        long j11 = t7Var2.N0 + 1;
                        t7Var2.N0 = j11;
                        s7Var2.I = j11;
                        s7Var2.c.setAllowStartLottieAnimation(true);
                        t7Var2.g0.c.startAnimation();
                        t7Var2.performHapticFeedback(0);
                        t7Var2.f0();
                        break;
                    }
                }
                break;
            default:
                t7 t7Var3 = this.b;
                if (t7Var3.q0 && t7Var3.g0 != null) {
                    t7Var3.q0 = false;
                    t7Var3.p0 = true;
                    t7Var3.removeCallbacks(t7Var3.B1);
                    ((lc0) t7Var3.d.b).Z();
                    t7Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    t7Var3.performHapticFeedback(4);
                    g7 j12 = t7Var3.j(t7Var3.g0);
                    if (j12 != null) {
                        j12.n();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    t7Var3.f0();
                    break;
                }
                break;
        }
    }
}

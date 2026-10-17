package org.telegram.ui.Wallet;

import org.telegram.ui.nc0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ o7(w7 w7Var, int i10) {
        this.a = i10;
        this.b = w7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j7 j10;
        switch (this.a) {
            case 0:
                w7 w7Var = this.b;
                w7Var.n0 = false;
                w7Var.g0 = null;
                w7Var.h0();
                break;
            case 1:
                this.b.S();
                break;
            case 2:
                w7 w7Var2 = this.b;
                v7 v7Var = w7Var2.g0;
                if (v7Var != null && !w7Var2.h0) {
                    if (!w7Var2.p0) {
                        if (w7Var2.k0 && (j10 = w7Var2.j(v7Var)) != null) {
                            w7Var2.U(j10);
                            break;
                        }
                    } else {
                        w7Var2.i0 = true;
                        w7Var2.w0 = Float.NaN;
                        w7Var2.z0 = Float.NaN;
                        w7Var2.x0 = 0.0f;
                        w7Var2.G0 = false;
                        w7Var2.y0 = v7Var.i.b;
                        v7Var.q.a(0.0f);
                        v7 v7Var2 = w7Var2.g0;
                        u7 u7Var = v7Var2.l;
                        u7Var.d = 260.0f;
                        u7Var.e = 0.58f;
                        u7Var.b = 1.0f;
                        long j11 = w7Var2.I0 + 1;
                        w7Var2.I0 = j11;
                        v7Var2.I = j11;
                        v7Var2.c.setAllowStartLottieAnimation(true);
                        w7Var2.g0.c.startAnimation();
                        w7Var2.performHapticFeedback(0);
                        w7Var2.h0();
                        break;
                    }
                }
                break;
            default:
                w7 w7Var3 = this.b;
                if (w7Var3.l0 && w7Var3.g0 != null) {
                    w7Var3.l0 = false;
                    w7Var3.k0 = true;
                    w7Var3.removeCallbacks(w7Var3.w1);
                    ((nc0) w7Var3.d.b).Z();
                    w7Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    w7Var3.performHapticFeedback(4);
                    j7 j12 = w7Var3.j(w7Var3.g0);
                    if (j12 != null) {
                        j12.n();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    w7Var3.h0();
                    break;
                }
                break;
        }
    }
}

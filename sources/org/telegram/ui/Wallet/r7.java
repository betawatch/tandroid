package org.telegram.ui.Wallet;

import org.telegram.ui.nc0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;

    public /* synthetic */ r7(z7 z7Var, int i10) {
        this.a = i10;
        this.b = z7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m7 j10;
        switch (this.a) {
            case 0:
                z7 z7Var = this.b;
                z7Var.n0 = false;
                z7Var.g0 = null;
                z7Var.h0();
                break;
            case 1:
                this.b.S();
                break;
            case 2:
                z7 z7Var2 = this.b;
                y7 y7Var = z7Var2.g0;
                if (y7Var != null && !z7Var2.h0) {
                    if (!z7Var2.p0) {
                        if (z7Var2.k0 && (j10 = z7Var2.j(y7Var)) != null) {
                            z7Var2.U(j10);
                            break;
                        }
                    } else {
                        z7Var2.i0 = true;
                        z7Var2.w0 = Float.NaN;
                        z7Var2.z0 = Float.NaN;
                        z7Var2.x0 = 0.0f;
                        z7Var2.G0 = false;
                        z7Var2.y0 = y7Var.i.b;
                        y7Var.q.a(0.0f);
                        y7 y7Var2 = z7Var2.g0;
                        x7 x7Var = y7Var2.l;
                        x7Var.d = 260.0f;
                        x7Var.e = 0.58f;
                        x7Var.b = 1.0f;
                        long j11 = z7Var2.I0 + 1;
                        z7Var2.I0 = j11;
                        y7Var2.I = j11;
                        y7Var2.c.setAllowStartLottieAnimation(true);
                        z7Var2.g0.c.startAnimation();
                        z7Var2.performHapticFeedback(0);
                        z7Var2.h0();
                        break;
                    }
                }
                break;
            default:
                z7 z7Var3 = this.b;
                if (z7Var3.l0 && z7Var3.g0 != null) {
                    z7Var3.l0 = false;
                    z7Var3.k0 = true;
                    z7Var3.removeCallbacks(z7Var3.w1);
                    ((nc0) z7Var3.d.b).Z();
                    z7Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    z7Var3.performHapticFeedback(4);
                    m7 j12 = z7Var3.j(z7Var3.g0);
                    if (j12 != null) {
                        j12.n();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    z7Var3.h0();
                    break;
                }
                break;
        }
    }
}

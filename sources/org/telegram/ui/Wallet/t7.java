package org.telegram.ui.Wallet;

import org.telegram.ui.oa0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ t7(b8 b8Var, int i7) {
        this.a = i7;
        this.b = b8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o7 j3;
        switch (this.a) {
            case 0:
                b8 b8Var = this.b;
                b8Var.s0 = false;
                b8Var.g0 = null;
                b8Var.f0();
                break;
            case 1:
                this.b.Q();
                break;
            case 2:
                b8 b8Var2 = this.b;
                a8 a8Var = b8Var2.g0;
                if (a8Var != null && !b8Var2.m0) {
                    if (!b8Var2.u0) {
                        if (b8Var2.p0 && (j3 = b8Var2.j(a8Var)) != null) {
                            b8Var2.S(j3);
                            break;
                        }
                    } else {
                        b8Var2.n0 = true;
                        b8Var2.h0 = a8Var;
                        b8Var2.B0 = Float.NaN;
                        b8Var2.E0 = Float.NaN;
                        b8Var2.C0 = 0.0f;
                        b8Var2.L0 = false;
                        b8Var2.D0 = a8Var.i.b;
                        a8Var.q.a(0.0f);
                        a8 a8Var2 = b8Var2.g0;
                        z7 z7Var = a8Var2.l;
                        z7Var.d = 260.0f;
                        z7Var.e = 0.58f;
                        z7Var.b = 1.0f;
                        long j10 = b8Var2.N0 + 1;
                        b8Var2.N0 = j10;
                        a8Var2.I = j10;
                        di.z2 z2Var = a8Var2.c;
                        z2Var.u0 = true;
                        z2Var.P0(false);
                        b8Var2.performHapticFeedback(0);
                        b8Var2.f0();
                        break;
                    }
                }
                break;
            default:
                b8 b8Var3 = this.b;
                if (b8Var3.q0 && b8Var3.g0 != null) {
                    b8Var3.q0 = false;
                    b8Var3.p0 = true;
                    b8Var3.removeCallbacks(b8Var3.B1);
                    ((oa0) b8Var3.d.a).X();
                    b8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    b8Var3.performHapticFeedback(4);
                    o7 j11 = b8Var3.j(b8Var3.g0);
                    if (j11 != null) {
                        j11.o();
                        j11.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    b8Var3.f0();
                    break;
                }
                break;
        }
    }
}

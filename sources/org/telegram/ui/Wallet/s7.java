package org.telegram.ui.Wallet;

import org.telegram.ui.qa0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;

    public /* synthetic */ s7(a8 a8Var, int i7) {
        this.a = i7;
        this.b = a8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n7 j3;
        switch (this.a) {
            case 0:
                a8 a8Var = this.b;
                a8Var.s0 = false;
                a8Var.g0 = null;
                a8Var.f0();
                break;
            case 1:
                this.b.Q();
                break;
            case 2:
                a8 a8Var2 = this.b;
                z7 z7Var = a8Var2.g0;
                if (z7Var != null && !a8Var2.m0) {
                    if (!a8Var2.u0) {
                        if (a8Var2.p0 && (j3 = a8Var2.j(z7Var)) != null) {
                            a8Var2.S(j3);
                            break;
                        }
                    } else {
                        a8Var2.n0 = true;
                        a8Var2.h0 = z7Var;
                        a8Var2.B0 = Float.NaN;
                        a8Var2.E0 = Float.NaN;
                        a8Var2.C0 = 0.0f;
                        a8Var2.L0 = false;
                        a8Var2.D0 = z7Var.i.b;
                        z7Var.q.a(0.0f);
                        z7 z7Var2 = a8Var2.g0;
                        y7 y7Var = z7Var2.l;
                        y7Var.d = 260.0f;
                        y7Var.e = 0.58f;
                        y7Var.b = 1.0f;
                        long j10 = a8Var2.N0 + 1;
                        a8Var2.N0 = j10;
                        z7Var2.I = j10;
                        di.z2 z2Var = z7Var2.c;
                        z2Var.u0 = true;
                        z2Var.P0(false);
                        a8Var2.performHapticFeedback(0);
                        a8Var2.f0();
                        break;
                    }
                }
                break;
            default:
                a8 a8Var3 = this.b;
                if (a8Var3.q0 && a8Var3.g0 != null) {
                    a8Var3.q0 = false;
                    a8Var3.p0 = true;
                    a8Var3.removeCallbacks(a8Var3.B1);
                    ((qa0) a8Var3.d.a).X();
                    a8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    a8Var3.performHapticFeedback(4);
                    n7 j11 = a8Var3.j(a8Var3.g0);
                    if (j11 != null) {
                        j11.o();
                        j11.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    a8Var3.f0();
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Wallet;

import org.telegram.ui.ka0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ t7(b8 b8Var, int i3) {
        this.a = i3;
        this.b = b8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o7 j10;
        switch (this.a) {
            case 0:
                b8 b8Var = this.b;
                b8Var.t0 = false;
                b8Var.h0 = null;
                b8Var.f0();
                break;
            case 1:
                this.b.Q();
                break;
            case 2:
                b8 b8Var2 = this.b;
                a8 a8Var = b8Var2.h0;
                if (a8Var != null && !b8Var2.n0) {
                    if (!b8Var2.v0) {
                        if (b8Var2.q0 && (j10 = b8Var2.j(a8Var)) != null) {
                            b8Var2.S(j10);
                            break;
                        }
                    } else {
                        b8Var2.o0 = true;
                        b8Var2.i0 = a8Var;
                        b8Var2.C0 = Float.NaN;
                        b8Var2.F0 = Float.NaN;
                        b8Var2.D0 = 0.0f;
                        b8Var2.M0 = false;
                        b8Var2.E0 = a8Var.i.b;
                        a8Var.q.a(0.0f);
                        a8 a8Var2 = b8Var2.h0;
                        z7 z7Var = a8Var2.l;
                        z7Var.d = 260.0f;
                        z7Var.e = 0.58f;
                        z7Var.b = 1.0f;
                        long j11 = b8Var2.O0 + 1;
                        b8Var2.O0 = j11;
                        a8Var2.I = j11;
                        ei.c3 c3Var = a8Var2.c;
                        c3Var.v0 = true;
                        c3Var.P0(false);
                        b8Var2.performHapticFeedback(0);
                        b8Var2.f0();
                        break;
                    }
                }
                break;
            default:
                b8 b8Var3 = this.b;
                if (b8Var3.r0 && b8Var3.h0 != null) {
                    b8Var3.r0 = false;
                    b8Var3.q0 = true;
                    b8Var3.removeCallbacks(b8Var3.C1);
                    ((ka0) b8Var3.d.b).X();
                    b8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    b8Var3.performHapticFeedback(4);
                    o7 j12 = b8Var3.j(b8Var3.h0);
                    if (j12 != null) {
                        j12.o();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    b8Var3.f0();
                    break;
                }
                break;
        }
    }
}

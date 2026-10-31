package org.telegram.ui.Wallet;

import org.telegram.ui.wb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ z7(h8 h8Var, int i10) {
        this.a = i10;
        this.b = h8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u7 j10;
        switch (this.a) {
            case 0:
                h8 h8Var = this.b;
                h8Var.s0 = false;
                h8Var.g0 = null;
                h8Var.f0();
                break;
            case 1:
                this.b.Q();
                break;
            case 2:
                h8 h8Var2 = this.b;
                g8 g8Var = h8Var2.g0;
                if (g8Var != null && !h8Var2.m0) {
                    if (!h8Var2.u0) {
                        if (h8Var2.p0 && (j10 = h8Var2.j(g8Var)) != null) {
                            h8Var2.S(j10);
                            break;
                        }
                    } else {
                        h8Var2.n0 = true;
                        h8Var2.h0 = g8Var;
                        h8Var2.B0 = Float.NaN;
                        h8Var2.E0 = Float.NaN;
                        h8Var2.C0 = 0.0f;
                        h8Var2.L0 = false;
                        h8Var2.D0 = g8Var.i.b;
                        g8Var.q.a(0.0f);
                        g8 g8Var2 = h8Var2.g0;
                        f8 f8Var = g8Var2.l;
                        f8Var.d = 260.0f;
                        f8Var.e = 0.58f;
                        f8Var.b = 1.0f;
                        long j11 = h8Var2.N0 + 1;
                        h8Var2.N0 = j11;
                        g8Var2.I = j11;
                        ag.c2 c2Var = g8Var2.c;
                        c2Var.u0 = true;
                        c2Var.P0(false);
                        h8Var2.performHapticFeedback(0);
                        h8Var2.f0();
                        break;
                    }
                }
                break;
            default:
                h8 h8Var3 = this.b;
                if (h8Var3.q0 && h8Var3.g0 != null) {
                    h8Var3.q0 = false;
                    h8Var3.p0 = true;
                    h8Var3.removeCallbacks(h8Var3.B1);
                    ((wb0) h8Var3.d.b).X();
                    h8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    h8Var3.performHapticFeedback(4);
                    u7 j12 = h8Var3.j(h8Var3.g0);
                    if (j12 != null) {
                        j12.o();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    h8Var3.f0();
                    break;
                }
                break;
        }
    }
}

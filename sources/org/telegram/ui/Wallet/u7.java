package org.telegram.ui.Wallet;

import org.telegram.ui.oa0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ u7(c8 c8Var, int i7) {
        this.a = i7;
        this.b = c8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p7 j3;
        switch (this.a) {
            case 0:
                c8 c8Var = this.b;
                c8Var.t0 = false;
                c8Var.h0 = null;
                c8Var.f0();
                break;
            case 1:
                this.b.Q();
                break;
            case 2:
                c8 c8Var2 = this.b;
                b8 b8Var = c8Var2.h0;
                if (b8Var != null && !c8Var2.n0) {
                    if (!c8Var2.v0) {
                        if (c8Var2.q0 && (j3 = c8Var2.j(b8Var)) != null) {
                            c8Var2.S(j3);
                            break;
                        }
                    } else {
                        c8Var2.o0 = true;
                        c8Var2.i0 = b8Var;
                        c8Var2.C0 = Float.NaN;
                        c8Var2.F0 = Float.NaN;
                        c8Var2.D0 = 0.0f;
                        c8Var2.M0 = false;
                        c8Var2.E0 = b8Var.i.b;
                        b8Var.q.a(0.0f);
                        b8 b8Var2 = c8Var2.h0;
                        a8 a8Var = b8Var2.l;
                        a8Var.d = 260.0f;
                        a8Var.e = 0.58f;
                        a8Var.b = 1.0f;
                        long j10 = c8Var2.O0 + 1;
                        c8Var2.O0 = j10;
                        b8Var2.I = j10;
                        fi.u2 u2Var = b8Var2.c;
                        u2Var.v0 = true;
                        u2Var.P0(false);
                        c8Var2.performHapticFeedback(0);
                        c8Var2.f0();
                        break;
                    }
                }
                break;
            default:
                c8 c8Var3 = this.b;
                if (c8Var3.r0 && c8Var3.h0 != null) {
                    c8Var3.r0 = false;
                    c8Var3.q0 = true;
                    c8Var3.removeCallbacks(c8Var3.C1);
                    ((oa0) c8Var3.d.b).X();
                    c8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    c8Var3.performHapticFeedback(4);
                    p7 j11 = c8Var3.j(c8Var3.h0);
                    if (j11 != null) {
                        j11.o();
                        j11.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    c8Var3.f0();
                    break;
                }
                break;
        }
    }
}

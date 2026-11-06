package org.telegram.ui.Wallet;

import org.telegram.ui.oa0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                c8Var.s0 = false;
                c8Var.g0 = null;
                c8Var.f0();
                break;
            case 1:
                this.b.Q();
                break;
            case 2:
                c8 c8Var2 = this.b;
                b8 b8Var = c8Var2.g0;
                if (b8Var != null && !c8Var2.m0) {
                    if (!c8Var2.u0) {
                        if (c8Var2.p0 && (j3 = c8Var2.j(b8Var)) != null) {
                            c8Var2.S(j3);
                            break;
                        }
                    } else {
                        c8Var2.n0 = true;
                        c8Var2.h0 = b8Var;
                        c8Var2.B0 = Float.NaN;
                        c8Var2.E0 = Float.NaN;
                        c8Var2.C0 = 0.0f;
                        c8Var2.L0 = false;
                        c8Var2.D0 = b8Var.i.b;
                        b8Var.q.a(0.0f);
                        b8 b8Var2 = c8Var2.g0;
                        a8 a8Var = b8Var2.l;
                        a8Var.d = 260.0f;
                        a8Var.e = 0.58f;
                        a8Var.b = 1.0f;
                        long j10 = c8Var2.N0 + 1;
                        c8Var2.N0 = j10;
                        b8Var2.I = j10;
                        di.z2 z2Var = b8Var2.c;
                        z2Var.u0 = true;
                        z2Var.P0(false);
                        c8Var2.performHapticFeedback(0);
                        c8Var2.f0();
                        break;
                    }
                }
                break;
            default:
                c8 c8Var3 = this.b;
                if (c8Var3.q0 && c8Var3.g0 != null) {
                    c8Var3.q0 = false;
                    c8Var3.p0 = true;
                    c8Var3.removeCallbacks(c8Var3.B1);
                    ((oa0) c8Var3.d.a).X();
                    c8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    c8Var3.performHapticFeedback(4);
                    p7 j11 = c8Var3.j(c8Var3.g0);
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

package org.telegram.ui.Wallet;

import org.telegram.ui.ra0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8 b;

    public /* synthetic */ v7(d8 d8Var, int i7) {
        this.a = i7;
        this.b = d8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q7 j3;
        switch (this.a) {
            case 0:
                d8 d8Var = this.b;
                d8Var.s0 = false;
                d8Var.g0 = null;
                d8Var.f0();
                break;
            case 1:
                this.b.Q();
                break;
            case 2:
                d8 d8Var2 = this.b;
                c8 c8Var = d8Var2.g0;
                if (c8Var != null && !d8Var2.m0) {
                    if (!d8Var2.u0) {
                        if (d8Var2.p0 && (j3 = d8Var2.j(c8Var)) != null) {
                            d8Var2.S(j3);
                            break;
                        }
                    } else {
                        d8Var2.n0 = true;
                        d8Var2.h0 = c8Var;
                        d8Var2.B0 = Float.NaN;
                        d8Var2.E0 = Float.NaN;
                        d8Var2.C0 = 0.0f;
                        d8Var2.L0 = false;
                        d8Var2.D0 = c8Var.i.b;
                        c8Var.q.a(0.0f);
                        c8 c8Var2 = d8Var2.g0;
                        b8 b8Var = c8Var2.l;
                        b8Var.d = 260.0f;
                        b8Var.e = 0.58f;
                        b8Var.b = 1.0f;
                        long j10 = d8Var2.N0 + 1;
                        d8Var2.N0 = j10;
                        c8Var2.I = j10;
                        di.z2 z2Var = c8Var2.c;
                        z2Var.u0 = true;
                        z2Var.P0(false);
                        d8Var2.performHapticFeedback(0);
                        d8Var2.f0();
                        break;
                    }
                }
                break;
            default:
                d8 d8Var3 = this.b;
                if (d8Var3.q0 && d8Var3.g0 != null) {
                    d8Var3.q0 = false;
                    d8Var3.p0 = true;
                    d8Var3.removeCallbacks(d8Var3.B1);
                    ((ra0) d8Var3.d.a).X();
                    d8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    d8Var3.performHapticFeedback(4);
                    q7 j11 = d8Var3.j(d8Var3.g0);
                    if (j11 != null) {
                        j11.o();
                        j11.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    d8Var3.f0();
                    break;
                }
                break;
        }
    }
}

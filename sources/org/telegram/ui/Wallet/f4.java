package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ f4(y5 y5Var, int i7) {
        this.a = i7;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var;
        int i7 = this.a;
        y5 y5Var = this.b;
        switch (i7) {
            case 0:
                y5.e0(y5Var);
                break;
            case 1:
                y5Var.getClass();
                y5Var.presentFragment(new o8());
                break;
            case 2:
                y5Var.getClass();
                y5Var.presentFragment(new gi.f());
                break;
            case 3:
                c8 c8Var = y5Var.j0;
                if (c8Var != null && (f0Var = y5Var.E0) != null) {
                    c8Var.Y(f0Var);
                }
                f0 f0Var2 = y5Var.E0;
                boolean z9 = (f0Var2 == null || f0Var2.a.isEmpty()) ? false : true;
                if (y5Var.f0 != z9) {
                    y5Var.L0(z9);
                }
                if (z9 && y5Var.F0) {
                    t8 t8Var = y5Var.i0;
                    if (t8Var != null) {
                        t8Var.b(false);
                    }
                    if (y5Var.f0) {
                        y5Var.F0 = false;
                        y5Var.e0 = 1;
                        fi.g1 g1Var = y5Var.p0;
                        if (g1Var != null) {
                            g1Var.setPosition(1);
                        }
                    } else {
                        y5Var.F0 = true;
                    }
                }
                fi.w3 w3Var = y5Var.a;
                if (w3Var != null && w3Var.f3 != null) {
                    y5Var.X0(true);
                    break;
                }
                break;
            case 4:
                y5Var.s0(false);
                break;
            case 5:
                y5Var.E0();
                break;
            case 6:
                y5Var.D0();
                break;
            case 7:
                if (y5Var.R.isAttachedToWindow()) {
                    if (!y5Var.a.canScrollVertically(-1)) {
                        y5Var.a.e3.h1(0, 0);
                    }
                    y5Var.R.requestLayout();
                    break;
                }
                break;
            case 8:
                y5Var.M0 = null;
                break;
            case 9:
                y5.h0(y5Var);
                break;
            case 10:
                y5Var.T0();
                break;
            case 11:
                hc.a0(y5Var).N(hd.M0(2131745862, null), hd.M0(2131751106, null)).j();
                break;
            case 12:
                y5Var.R.post(new f4(y5Var, 7));
                break;
            case 13:
                y5Var.D0();
                break;
            default:
                y5Var.D0();
                break;
        }
    }
}

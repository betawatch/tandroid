package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ e4(x5 x5Var, int i7) {
        this.a = i7;
        this.b = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var;
        int i7 = this.a;
        x5 x5Var = this.b;
        switch (i7) {
            case 0:
                x5.e0(x5Var);
                break;
            case 1:
                x5Var.getClass();
                x5Var.presentFragment(new n8());
                break;
            case 2:
                x5Var.getClass();
                x5Var.presentFragment(new gi.f());
                break;
            case 3:
                b8 b8Var = x5Var.j0;
                if (b8Var != null && (e0Var = x5Var.E0) != null) {
                    b8Var.Y(e0Var);
                }
                e0 e0Var2 = x5Var.E0;
                boolean z9 = (e0Var2 == null || e0Var2.a.isEmpty()) ? false : true;
                if (x5Var.f0 != z9) {
                    x5Var.L0(z9);
                }
                if (z9 && x5Var.F0) {
                    s8 s8Var = x5Var.i0;
                    if (s8Var != null) {
                        s8Var.b(false);
                    }
                    if (x5Var.f0) {
                        x5Var.F0 = false;
                        x5Var.e0 = 1;
                        fi.g1 g1Var = x5Var.p0;
                        if (g1Var != null) {
                            g1Var.setPosition(1);
                        }
                    } else {
                        x5Var.F0 = true;
                    }
                }
                fi.w3 w3Var = x5Var.a;
                if (w3Var != null && w3Var.f3 != null) {
                    x5Var.X0(true);
                    break;
                }
                break;
            case 4:
                x5Var.s0(false);
                break;
            case 5:
                x5Var.E0();
                break;
            case 6:
                x5Var.D0();
                break;
            case 7:
                if (x5Var.R.isAttachedToWindow()) {
                    if (!x5Var.a.canScrollVertically(-1)) {
                        x5Var.a.e3.h1(0, 0);
                    }
                    x5Var.R.requestLayout();
                    break;
                }
                break;
            case 8:
                x5Var.M0 = null;
                break;
            case 9:
                x5.h0(x5Var);
                break;
            case 10:
                x5Var.T0();
                break;
            case 11:
                hc.a0(x5Var).N(id.M0(2131745864, null), id.M0(2131751106, null)).j();
                break;
            case 12:
                x5Var.R.post(new e4(x5Var, 7));
                break;
            case 13:
                x5Var.D0();
                break;
            default:
                x5Var.D0();
                break;
        }
    }
}

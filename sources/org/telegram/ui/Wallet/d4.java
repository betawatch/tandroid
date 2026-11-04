package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ d4(w5 w5Var, int i3) {
        this.a = i3;
        this.b = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var;
        int i3 = this.a;
        w5 w5Var = this.b;
        switch (i3) {
            case 0:
                w5.e0(w5Var);
                break;
            case 1:
                w5Var.getClass();
                w5Var.presentFragment(new n8());
                break;
            case 2:
                w5Var.getClass();
                w5Var.presentFragment(new hi.g());
                break;
            case 3:
                b8 b8Var = w5Var.k0;
                if (b8Var != null && (c0Var = w5Var.F0) != null) {
                    b8Var.Y(c0Var);
                }
                c0 c0Var2 = w5Var.F0;
                boolean z10 = (c0Var2 == null || c0Var2.a.isEmpty()) ? false : true;
                if (w5Var.g0 != z10) {
                    w5Var.L0(z10);
                }
                if (z10 && w5Var.G0) {
                    s8 s8Var = w5Var.j0;
                    if (s8Var != null) {
                        s8Var.b(false);
                    }
                    if (w5Var.g0) {
                        w5Var.G0 = false;
                        w5Var.f0 = 1;
                        gi.g1 g1Var = w5Var.q0;
                        if (g1Var != null) {
                            g1Var.setPosition(1);
                        }
                    } else {
                        w5Var.G0 = true;
                    }
                }
                ai.h4 h4Var = w5Var.a;
                if (h4Var != null && h4Var.g3 != null) {
                    w5Var.X0(true);
                    break;
                }
                break;
            case 4:
                w5Var.s0(false);
                break;
            case 5:
                w5Var.E0();
                break;
            case 6:
                w5Var.D0();
                break;
            case 7:
                if (w5Var.S.isAttachedToWindow()) {
                    if (!w5Var.a.canScrollVertically(-1)) {
                        w5Var.a.f3.h1(0, 0);
                    }
                    w5Var.S.requestLayout();
                    break;
                }
                break;
            case 8:
                w5Var.N0 = null;
                break;
            case 9:
                w5.h0(w5Var);
                break;
            case 10:
                w5Var.T0();
                break;
            case 11:
                fc.a0(w5Var).N(bd.M0(2131745871, null), bd.M0(2131751106, null)).j();
                break;
            case 12:
                w5Var.S.post(new d4(w5Var, 7));
                break;
            case 13:
                w5Var.D0();
                break;
            default:
                w5Var.D0();
                break;
        }
    }
}

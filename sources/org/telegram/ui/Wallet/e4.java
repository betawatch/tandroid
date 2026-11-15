package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ e4(y5 y5Var, int i7) {
        this.a = i7;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        int i7 = this.a;
        y5 y5Var = this.b;
        switch (i7) {
            case 0:
                y5Var.S.post(new e4(y5Var, 8));
                break;
            case 1:
                y5.e0(y5Var);
                break;
            case 2:
                y5Var.getClass();
                y5Var.presentFragment(new p8());
                break;
            case 3:
                y5Var.getClass();
                y5Var.presentFragment(new ii.f());
                break;
            case 4:
                c8 c8Var = y5Var.k0;
                if (c8Var != null && (d0Var = y5Var.F0) != null) {
                    c8Var.Y(d0Var);
                }
                d0 d0Var2 = y5Var.F0;
                boolean z10 = (d0Var2 == null || d0Var2.a.isEmpty()) ? false : true;
                if (y5Var.g0 != z10) {
                    y5Var.M0(z10);
                }
                if (z10 && y5Var.G0) {
                    u8 u8Var = y5Var.j0;
                    if (u8Var != null) {
                        u8Var.b(false);
                    }
                    if (y5Var.g0) {
                        y5Var.G0 = false;
                        y5Var.f0 = 1;
                        hi.i1 i1Var = y5Var.q0;
                        if (i1Var != null) {
                            i1Var.setPosition(1);
                        }
                    } else {
                        y5Var.G0 = true;
                    }
                }
                bi.v3 v3Var = y5Var.a;
                if (v3Var != null && v3Var.g3 != null) {
                    y5Var.Y0(true);
                    break;
                }
                break;
            case 5:
                y5Var.s0(false);
                break;
            case 6:
                y5Var.E0();
                break;
            case 7:
                y5Var.D0();
                break;
            case 8:
                if (y5Var.S.isAttachedToWindow()) {
                    if (!y5Var.a.canScrollVertically(-1)) {
                        y5Var.a.f3.h1(0, 0);
                    }
                    y5Var.S.requestLayout();
                    break;
                }
                break;
            case 9:
                y5Var.N0 = null;
                break;
            case 10:
                y5.h0(y5Var);
                break;
            case 11:
                cc.a0(y5Var).N(hd.M0(2131745861, null), hd.M0(2131751105, null)).j();
                break;
            case 12:
                y5Var.U0();
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

package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ d4(w5 w5Var, int i7) {
        this.a = i7;
        this.b = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        int i7 = this.a;
        w5 w5Var = this.b;
        switch (i7) {
            case 0:
                w5.e0(w5Var);
                break;
            case 1:
                w5Var.getClass();
                w5Var.presentFragment(new m8());
                break;
            case 2:
                w5Var.getClass();
                w5Var.presentFragment(new gi.f());
                break;
            case 3:
                a8 a8Var = w5Var.j0;
                if (a8Var != null && (d0Var = w5Var.E0) != null) {
                    a8Var.Y(d0Var);
                }
                d0 d0Var2 = w5Var.E0;
                boolean z9 = (d0Var2 == null || d0Var2.a.isEmpty()) ? false : true;
                if (w5Var.f0 != z9) {
                    w5Var.L0(z9);
                }
                if (z9 && w5Var.F0) {
                    r8 r8Var = w5Var.i0;
                    if (r8Var != null) {
                        r8Var.b(false);
                    }
                    if (w5Var.f0) {
                        w5Var.F0 = false;
                        w5Var.e0 = 1;
                        fi.g1 g1Var = w5Var.p0;
                        if (g1Var != null) {
                            g1Var.setPosition(1);
                        }
                    } else {
                        w5Var.F0 = true;
                    }
                }
                fi.w3 w3Var = w5Var.a;
                if (w3Var != null && w3Var.f3 != null) {
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
                if (w5Var.R.isAttachedToWindow()) {
                    if (!w5Var.a.canScrollVertically(-1)) {
                        w5Var.a.e3.h1(0, 0);
                    }
                    w5Var.R.requestLayout();
                    break;
                }
                break;
            case 8:
                w5Var.M0 = null;
                break;
            case 9:
                w5.h0(w5Var);
                break;
            case 10:
                w5Var.T0();
                break;
            case 11:
                hc.a0(w5Var).N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                break;
            case 12:
                w5Var.R.post(new d4(w5Var, 7));
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

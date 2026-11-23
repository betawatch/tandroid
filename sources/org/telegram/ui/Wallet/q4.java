package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;

    public /* synthetic */ q4(n6 n6Var, int i7) {
        this.a = i7;
        this.b = n6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0 l0Var;
        int i7 = this.a;
        n6 n6Var = this.b;
        switch (i7) {
            case 0:
                r8 r8Var = n6Var.k0;
                if (r8Var != null && (l0Var = n6Var.H0) != null) {
                    r8Var.Y(l0Var);
                }
                l0 l0Var2 = n6Var.H0;
                boolean z10 = (l0Var2 == null || l0Var2.a.isEmpty()) ? false : true;
                if (n6Var.g0 != z10) {
                    n6Var.Q0(z10);
                }
                if (z10 && n6Var.I0) {
                    j9 j9Var = n6Var.j0;
                    if (j9Var != null) {
                        j9Var.b(false);
                    }
                    if (n6Var.g0) {
                        n6Var.I0 = false;
                        n6Var.f0 = 1;
                        hi.i1 i1Var = n6Var.s0;
                        if (i1Var != null) {
                            i1Var.setPosition(1);
                        }
                    } else {
                        n6Var.I0 = true;
                    }
                }
                bi.f6 f6Var = n6Var.a;
                if (f6Var != null && f6Var.g3 != null) {
                    n6Var.c1(true);
                    break;
                }
                break;
            case 1:
                n6Var.t0(false);
                break;
            case 2:
                n6Var.I0();
                break;
            case 3:
                n6Var.H0();
                break;
            case 4:
                if (n6Var.S.isAttachedToWindow()) {
                    if (!n6Var.a.canScrollVertically(-1)) {
                        n6Var.a.f3.h1(0, 0);
                    }
                    n6Var.S.requestLayout();
                    break;
                }
                break;
            case 5:
                n6.g0(n6Var);
                break;
            case 6:
                n6Var.Y0();
                break;
            case 7:
                n6Var.Q0 = null;
                break;
            case 8:
                n6Var.S.post(new q4(n6Var, 4));
                break;
            case 9:
                lc.b0(n6Var).N(hd.N0(2131745665, null), hd.N0(2131751093, null)).j();
                break;
            case 10:
                n6.j0(n6Var);
                break;
            case 11:
                n6Var.getClass();
                n6Var.presentFragment(new d9());
                break;
            case 12:
                n6Var.getClass();
                n6Var.presentFragment(new ii.t());
                break;
            case 13:
                n6Var.H0();
                break;
            default:
                n6Var.H0();
                break;
        }
    }
}

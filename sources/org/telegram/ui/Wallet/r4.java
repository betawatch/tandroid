package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ r4(o6 o6Var, int i7) {
        this.a = i7;
        this.b = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0 m0Var;
        int i7 = this.a;
        o6 o6Var = this.b;
        switch (i7) {
            case 0:
                s8 s8Var = o6Var.k0;
                if (s8Var != null && (m0Var = o6Var.H0) != null) {
                    s8Var.Y(m0Var);
                }
                m0 m0Var2 = o6Var.H0;
                boolean z10 = (m0Var2 == null || m0Var2.a.isEmpty()) ? false : true;
                if (o6Var.g0 != z10) {
                    o6Var.Q0(z10);
                }
                if (z10 && o6Var.I0) {
                    k9 k9Var = o6Var.j0;
                    if (k9Var != null) {
                        k9Var.b(false);
                    }
                    if (o6Var.g0) {
                        o6Var.I0 = false;
                        o6Var.f0 = 1;
                        hi.q1 q1Var = o6Var.s0;
                        if (q1Var != null) {
                            q1Var.setPosition(1);
                        }
                    } else {
                        o6Var.I0 = true;
                    }
                }
                bi.i6 i6Var = o6Var.a;
                if (i6Var != null && i6Var.g3 != null) {
                    o6Var.c1(true);
                    break;
                }
                break;
            case 1:
                o6Var.t0(false);
                break;
            case 2:
                o6Var.I0();
                break;
            case 3:
                o6Var.H0();
                break;
            case 4:
                if (o6Var.S.isAttachedToWindow()) {
                    if (!o6Var.a.canScrollVertically(-1)) {
                        o6Var.a.f3.h1(0, 0);
                    }
                    o6Var.S.requestLayout();
                    break;
                }
                break;
            case 5:
                o6.g0(o6Var);
                break;
            case 6:
                o6Var.Y0();
                break;
            case 7:
                o6Var.Q0 = null;
                break;
            case 8:
                o6Var.S.post(new r4(o6Var, 4));
                break;
            case 9:
                kc.b0(o6Var).N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                break;
            case 10:
                o6.j0(o6Var);
                break;
            case 11:
                o6Var.getClass();
                o6Var.presentFragment(new e9());
                break;
            case 12:
                o6Var.getClass();
                o6Var.presentFragment(new ii.t());
                break;
            case 13:
                o6Var.H0();
                break;
            default:
                o6Var.H0();
                break;
        }
    }
}

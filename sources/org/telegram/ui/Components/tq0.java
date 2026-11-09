package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tq0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ tq0(ViewGroup viewGroup, Object obj, int i7) {
        this.c = i7;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.c) {
            case 0:
                ur0 ur0Var = (ur0) this.d;
                v4.g0 adapter = ur0Var.n.getAdapter();
                zs0 zs0Var = (zs0) this.e;
                ts0 ts0Var = zs0Var.K;
                if (adapter == ts0Var) {
                    if (ts0Var.d(i7) == 2) {
                        return ur0Var.r.J;
                    }
                    return 1;
                }
                if (zs0.y(zs0Var, adapter) == -1) {
                    return 1;
                }
                ((ws0) adapter).getClass();
                return 1;
            case 1:
                p41 p41Var = (p41) this.d;
                m41 m41Var = ((r41) this.e).f3;
                if (m41Var == null) {
                    return p41Var.J;
                }
                y31 G = m41Var.G(i7);
                return (G == null || (i10 = G.u) == -1) ? p41Var.J : i10;
            default:
                p41 p41Var2 = (p41) this.d;
                m41 m41Var2 = ((r41) this.e).f3;
                if (m41Var2 == null) {
                    return p41Var2.J;
                }
                y31 G2 = m41Var2.G(i7);
                return (G2 == null || (i11 = G2.u) == -1) ? p41Var2.J : i11;
        }
    }
}

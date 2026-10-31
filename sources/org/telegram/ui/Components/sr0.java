package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sr0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ sr0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                ss0 ss0Var = (ss0) this.d;
                s4.g0 adapter = ss0Var.n.getAdapter();
                zt0 zt0Var = (zt0) this.e;
                tt0 tt0Var = zt0Var.K;
                if (adapter == tt0Var) {
                    if (tt0Var.d(i10) == 2) {
                        return ss0Var.r.J;
                    }
                    return 1;
                }
                if (zt0.w(zt0Var, adapter) == -1) {
                    return 1;
                }
                ((wt0) adapter).getClass();
                return 1;
            case 1:
                s51 s51Var = (s51) this.d;
                p51 p51Var = ((u51) this.e).f3;
                if (p51Var == null) {
                    return s51Var.J;
                }
                a51 G = p51Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? s51Var.J : i11;
            default:
                s51 s51Var2 = (s51) this.d;
                p51 p51Var2 = ((u51) this.e).f3;
                if (p51Var2 == null) {
                    return s51Var2.J;
                }
                a51 G2 = p51Var2.G(i10);
                return (G2 == null || (i12 = G2.u) == -1) ? s51Var2.J : i12;
        }
    }
}

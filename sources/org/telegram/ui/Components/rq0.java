package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rq0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ rq0(ViewGroup viewGroup, Object obj, int i3) {
        this.c = i3;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i3) {
        int i10;
        int i11;
        switch (this.c) {
            case 0:
                rr0 rr0Var = (rr0) this.d;
                u4.h0 adapter = rr0Var.n.getAdapter();
                ws0 ws0Var = (ws0) this.e;
                qs0 qs0Var = ws0Var.L;
                if (adapter == qs0Var) {
                    if (qs0Var.d(i3) == 2) {
                        return rr0Var.r.J;
                    }
                    return 1;
                }
                if (ws0.y(ws0Var, adapter) == -1) {
                    return 1;
                }
                ((ts0) adapter).getClass();
                return 1;
            case 1:
                j41 j41Var = (j41) this.d;
                f41 f41Var = ((l41) this.e).g3;
                if (f41Var == null) {
                    return j41Var.J;
                }
                r31 G = f41Var.G(i3);
                return (G == null || (i10 = G.u) == -1) ? j41Var.J : i10;
            default:
                j41 j41Var2 = (j41) this.d;
                f41 f41Var2 = ((l41) this.e).g3;
                if (f41Var2 == null) {
                    return j41Var2.J;
                }
                r31 G2 = f41Var2.G(i3);
                return (G2 == null || (i11 = G2.u) == -1) ? j41Var2.J : i11;
        }
    }
}

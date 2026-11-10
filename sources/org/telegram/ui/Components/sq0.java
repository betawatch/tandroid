package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sq0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ sq0(ViewGroup viewGroup, Object obj, int i7) {
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
                tr0 tr0Var = (tr0) this.d;
                v4.g0 adapter = tr0Var.n.getAdapter();
                ys0 ys0Var = (ys0) this.e;
                ss0 ss0Var = ys0Var.K;
                if (adapter == ss0Var) {
                    if (ss0Var.d(i7) == 2) {
                        return tr0Var.r.J;
                    }
                    return 1;
                }
                if (ys0.y(ys0Var, adapter) == -1) {
                    return 1;
                }
                ((vs0) adapter).getClass();
                return 1;
            case 1:
                p41 p41Var = (p41) this.d;
                m41 m41Var = ((r41) this.e).f3;
                if (m41Var == null) {
                    return p41Var.J;
                }
                x31 G = m41Var.G(i7);
                return (G == null || (i10 = G.u) == -1) ? p41Var.J : i10;
            default:
                p41 p41Var2 = (p41) this.d;
                m41 m41Var2 = ((r41) this.e).f3;
                if (m41Var2 == null) {
                    return p41Var2.J;
                }
                x31 G2 = m41Var2.G(i7);
                return (G2 == null || (i11 = G2.u) == -1) ? p41Var2.J : i11;
        }
    }
}

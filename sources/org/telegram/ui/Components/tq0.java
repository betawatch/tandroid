package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                tr0 tr0Var = (tr0) this.d;
                v4.h0 adapter = tr0Var.n.getAdapter();
                ys0 ys0Var = (ys0) this.e;
                ss0 ss0Var = ys0Var.L;
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
                s41 s41Var = (s41) this.d;
                p41 p41Var = ((u41) this.e).g3;
                if (p41Var == null) {
                    return s41Var.J;
                }
                b41 G = p41Var.G(i7);
                return (G == null || (i10 = G.u) == -1) ? s41Var.J : i10;
            default:
                s41 s41Var2 = (s41) this.d;
                p41 p41Var2 = ((u41) this.e).g3;
                if (p41Var2 == null) {
                    return s41Var2.J;
                }
                b41 G2 = p41Var2.G(i7);
                return (G2 == null || (i11 = G2.u) == -1) ? s41Var2.J : i11;
        }
    }
}

package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class rq0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ rq0(ViewGroup viewGroup, Object obj, int i7) {
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
                sr0 sr0Var = (sr0) this.d;
                v4.g0 adapter = sr0Var.n.getAdapter();
                xs0 xs0Var = (xs0) this.e;
                rs0 rs0Var = xs0Var.K;
                if (adapter == rs0Var) {
                    if (rs0Var.d(i7) == 2) {
                        return sr0Var.r.J;
                    }
                    return 1;
                }
                if (xs0.y(xs0Var, adapter) == -1) {
                    return 1;
                }
                ((us0) adapter).getClass();
                return 1;
            case 1:
                o41 o41Var = (o41) this.d;
                l41 l41Var = ((q41) this.e).f3;
                if (l41Var == null) {
                    return o41Var.J;
                }
                x31 G = l41Var.G(i7);
                return (G == null || (i10 = G.u) == -1) ? o41Var.J : i10;
            default:
                o41 o41Var2 = (o41) this.d;
                l41 l41Var2 = ((q41) this.e).f3;
                if (l41Var2 == null) {
                    return o41Var2.J;
                }
                x31 G2 = l41Var2.G(i7);
                return (G2 == null || (i11 = G2.u) == -1) ? o41Var2.J : i11;
        }
    }
}

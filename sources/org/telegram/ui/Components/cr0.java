package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cr0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ cr0(ViewGroup viewGroup, Object obj, int i7) {
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
                ds0 ds0Var = (ds0) this.d;
                v4.i0 adapter = ds0Var.n.getAdapter();
                it0 it0Var = (it0) this.e;
                ct0 ct0Var = it0Var.L;
                if (adapter == ct0Var) {
                    if (ct0Var.d(i7) == 2) {
                        return ds0Var.r.J;
                    }
                    return 1;
                }
                if (it0.y(it0Var, adapter) == -1) {
                    return 1;
                }
                ((ft0) adapter).getClass();
                return 1;
            case 1:
                e51 e51Var = (e51) this.d;
                b51 b51Var = ((g51) this.e).g3;
                if (b51Var == null) {
                    return e51Var.J;
                }
                n41 G = b51Var.G(i7);
                return (G == null || (i10 = G.v) == -1) ? e51Var.J : i10;
            default:
                e51 e51Var2 = (e51) this.d;
                b51 b51Var2 = ((g51) this.e).g3;
                if (b51Var2 == null) {
                    return e51Var2.J;
                }
                n41 G2 = b51Var2.G(i7);
                return (G2 == null || (i11 = G2.v) == -1) ? e51Var2.J : i11;
        }
    }
}

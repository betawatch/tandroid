package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vs0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ vs0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                au0 au0Var = (au0) this.d;
                s4.h0 adapter = au0Var.r.getAdapter();
                iv0 iv0Var = (iv0) this.e;
                cv0 cv0Var = iv0Var.I;
                if (adapter == cv0Var) {
                    if (cv0Var.j(i10) == 2) {
                        return au0Var.s.J;
                    }
                    return 1;
                }
                if (iv0.v(iv0Var, adapter) == -1) {
                    return 1;
                }
                ((fv0) adapter).getClass();
                return 1;
            default:
                ai.n nVar = (ai.n) this.d;
                j61 j61Var = ((r61) this.e).Y2;
                if (j61Var == null) {
                    return nVar.J;
                }
                v51 G = j61Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? nVar.J : i11;
        }
    }
}

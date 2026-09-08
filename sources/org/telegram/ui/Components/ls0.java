package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ls0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ ls0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                qt0 qt0Var = (qt0) this.d;
                s4.h0 adapter = qt0Var.r.getAdapter();
                xu0 xu0Var = (xu0) this.e;
                ru0 ru0Var = xu0Var.I;
                if (adapter == ru0Var) {
                    if (ru0Var.j(i10) == 2) {
                        return qt0Var.s.J;
                    }
                    return 1;
                }
                if (xu0.v(xu0Var, adapter) == -1) {
                    return 1;
                }
                ((uu0) adapter).getClass();
                return 1;
            default:
                ci.h hVar = (ci.h) this.d;
                v51 v51Var = ((d61) this.e).Y2;
                if (v51Var == null) {
                    return hVar.J;
                }
                h51 G = v51Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? hVar.J : i11;
        }
    }
}

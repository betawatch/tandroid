package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class gt0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ gt0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                lu0 lu0Var = (lu0) this.d;
                s4.g0 adapter = lu0Var.r.getAdapter();
                sv0 sv0Var = (sv0) this.e;
                mv0 mv0Var = sv0Var.I;
                if (adapter == mv0Var) {
                    if (mv0Var.j(i10) == 2) {
                        return lu0Var.s.J;
                    }
                    return 1;
                }
                if (sv0.p(sv0Var, adapter) == -1) {
                    return 1;
                }
                ((pv0) adapter).getClass();
                return 1;
            default:
                di.h hVar = (di.h) this.d;
                s61 s61Var = ((a71) this.e).W2;
                if (s61Var == null) {
                    return hVar.J;
                }
                f61 G = s61Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? hVar.J : i11;
        }
    }
}

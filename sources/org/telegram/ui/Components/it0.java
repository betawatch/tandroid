package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class it0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ it0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                nu0 nu0Var = (nu0) this.d;
                s4.g0 adapter = nu0Var.r.getAdapter();
                uv0 uv0Var = (uv0) this.e;
                ov0 ov0Var = uv0Var.I;
                if (adapter == ov0Var) {
                    if (ov0Var.j(i10) == 2) {
                        return nu0Var.s.J;
                    }
                    return 1;
                }
                if (uv0.p(uv0Var, adapter) == -1) {
                    return 1;
                }
                ((rv0) adapter).getClass();
                return 1;
            default:
                di.h hVar = (di.h) this.d;
                u61 u61Var = ((c71) this.e).W2;
                if (u61Var == null) {
                    return hVar.J;
                }
                h61 G = u61Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? hVar.J : i11;
        }
    }
}

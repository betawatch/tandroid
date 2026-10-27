package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tt0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ tt0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                uu0 uu0Var = (uu0) this.d;
                s4.h0 adapter = uu0Var.n.getAdapter();
                bw0 bw0Var = (bw0) this.e;
                vv0 vv0Var = bw0Var.K;
                if (adapter == vv0Var) {
                    if (vv0Var.j(i10) == 2) {
                        return uu0Var.r.J;
                    }
                    return 1;
                }
                if (bw0.x(bw0Var, adapter) == -1) {
                    return 1;
                }
                ((yv0) adapter).getClass();
                return 1;
            default:
                ei.h hVar = (ei.h) this.d;
                k71 k71Var = ((s71) this.e).g3;
                if (k71Var == null) {
                    return hVar.J;
                }
                u61 G = k71Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? hVar.J : i11;
        }
    }
}

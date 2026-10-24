package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class lt0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ lt0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                qu0 qu0Var = (qu0) this.d;
                s4.g0 adapter = qu0Var.r.getAdapter();
                xv0 xv0Var = (xv0) this.e;
                rv0 rv0Var = xv0Var.I;
                if (adapter == rv0Var) {
                    if (rv0Var.j(i10) == 2) {
                        return qu0Var.s.J;
                    }
                    return 1;
                }
                if (xv0.p(xv0Var, adapter) == -1) {
                    return 1;
                }
                ((uv0) adapter).getClass();
                return 1;
            default:
                di.h hVar = (di.h) this.d;
                b71 b71Var = ((j71) this.e).Z2;
                if (b71Var == null) {
                    return hVar.J;
                }
                m61 G = b71Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? hVar.J : i11;
        }
    }
}

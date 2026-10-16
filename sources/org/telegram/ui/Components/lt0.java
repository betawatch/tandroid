package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                if (xv0.v(xv0Var, adapter) == -1) {
                    return 1;
                }
                ((uv0) adapter).getClass();
                return 1;
            default:
                ci.h hVar = (ci.h) this.d;
                a71 a71Var = ((i71) this.e).W2;
                if (a71Var == null) {
                    return hVar.J;
                }
                m61 G = a71Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? hVar.J : i11;
        }
    }
}

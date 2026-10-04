package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class dt0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ dt0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                iu0 iu0Var = (iu0) this.d;
                s4.h0 adapter = iu0Var.r.getAdapter();
                pv0 pv0Var = (pv0) this.e;
                jv0 jv0Var = pv0Var.I;
                if (adapter == jv0Var) {
                    if (jv0Var.j(i10) == 2) {
                        return iu0Var.s.J;
                    }
                    return 1;
                }
                if (pv0.v(pv0Var, adapter) == -1) {
                    return 1;
                }
                ((mv0) adapter).getClass();
                return 1;
            default:
                bi.i iVar = (bi.i) this.d;
                u61 u61Var = ((c71) this.e).f3;
                if (u61Var == null) {
                    return iVar.J;
                }
                g61 G = u61Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? iVar.J : i11;
        }
    }
}

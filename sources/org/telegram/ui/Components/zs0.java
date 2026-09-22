package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zs0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ zs0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                eu0 eu0Var = (eu0) this.d;
                s4.h0 adapter = eu0Var.r.getAdapter();
                lv0 lv0Var = (lv0) this.e;
                fv0 fv0Var = lv0Var.I;
                if (adapter == fv0Var) {
                    if (fv0Var.j(i10) == 2) {
                        return eu0Var.s.J;
                    }
                    return 1;
                }
                if (lv0.v(lv0Var, adapter) == -1) {
                    return 1;
                }
                ((iv0) adapter).getClass();
                return 1;
            default:
                bi.i iVar = (bi.i) this.d;
                m61 m61Var = ((u61) this.e).Y2;
                if (m61Var == null) {
                    return iVar.J;
                }
                y51 G = m61Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? iVar.J : i11;
        }
    }
}

package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                l61 l61Var = ((t61) this.e).Y2;
                if (l61Var == null) {
                    return iVar.J;
                }
                x51 G = l61Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? iVar.J : i11;
        }
    }
}

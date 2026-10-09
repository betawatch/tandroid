package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pt0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ pt0(ViewGroup viewGroup, Object obj, int i10) {
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
                s4.i0 adapter = uu0Var.r.getAdapter();
                bw0 bw0Var = (bw0) this.e;
                vv0 vv0Var = bw0Var.I;
                if (adapter == vv0Var) {
                    if (vv0Var.j(i10) == 2) {
                        return uu0Var.s.J;
                    }
                    return 1;
                }
                if (bw0.v(bw0Var, adapter) == -1) {
                    return 1;
                }
                ((yv0) adapter).getClass();
                return 1;
            default:
                bi.i iVar = (bi.i) this.d;
                c71 c71Var = ((k71) this.e).W2;
                if (c71Var == null) {
                    return iVar.J;
                }
                p61 G = c71Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? iVar.J : i11;
        }
    }
}

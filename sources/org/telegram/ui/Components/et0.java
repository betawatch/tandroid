package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class et0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ et0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                ju0 ju0Var = (ju0) this.d;
                s4.h0 adapter = ju0Var.r.getAdapter();
                qv0 qv0Var = (qv0) this.e;
                kv0 kv0Var = qv0Var.I;
                if (adapter == kv0Var) {
                    if (kv0Var.j(i10) == 2) {
                        return ju0Var.s.J;
                    }
                    return 1;
                }
                if (qv0.v(qv0Var, adapter) == -1) {
                    return 1;
                }
                ((nv0) adapter).getClass();
                return 1;
            default:
                bi.i iVar = (bi.i) this.d;
                w61 w61Var = ((e71) this.e).f3;
                if (w61Var == null) {
                    return iVar.J;
                }
                h61 G = w61Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? iVar.J : i11;
        }
    }
}

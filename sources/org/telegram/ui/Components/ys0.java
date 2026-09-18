package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ys0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ ys0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                du0 du0Var = (du0) this.d;
                s4.h0 adapter = du0Var.r.getAdapter();
                kv0 kv0Var = (kv0) this.e;
                ev0 ev0Var = kv0Var.I;
                if (adapter == ev0Var) {
                    if (ev0Var.j(i10) == 2) {
                        return du0Var.s.J;
                    }
                    return 1;
                }
                if (kv0.v(kv0Var, adapter) == -1) {
                    return 1;
                }
                ((hv0) adapter).getClass();
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

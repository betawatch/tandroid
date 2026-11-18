package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class br0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ br0(ViewGroup viewGroup, Object obj, int i7) {
        this.c = i7;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.c) {
            case 0:
                bs0 bs0Var = (bs0) this.d;
                v4.i0 adapter = bs0Var.n.getAdapter();
                gt0 gt0Var = (gt0) this.e;
                at0 at0Var = gt0Var.L;
                if (adapter == at0Var) {
                    if (at0Var.d(i7) == 2) {
                        return bs0Var.r.J;
                    }
                    return 1;
                }
                if (gt0.y(gt0Var, adapter) == -1) {
                    return 1;
                }
                ((dt0) adapter).getClass();
                return 1;
            case 1:
                c51 c51Var = (c51) this.d;
                z41 z41Var = ((e51) this.e).g3;
                if (z41Var == null) {
                    return c51Var.J;
                }
                l41 G = z41Var.G(i7);
                return (G == null || (i10 = G.v) == -1) ? c51Var.J : i10;
            default:
                c51 c51Var2 = (c51) this.d;
                z41 z41Var2 = ((e51) this.e).g3;
                if (z41Var2 == null) {
                    return c51Var2.J;
                }
                l41 G2 = z41Var2.G(i7);
                return (G2 == null || (i11 = G2.v) == -1) ? c51Var2.J : i11;
        }
    }
}

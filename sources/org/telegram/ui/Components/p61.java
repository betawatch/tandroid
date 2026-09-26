package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class p61 extends g.p {
    public final /* synthetic */ o61 c;
    public final /* synthetic */ r61 d;

    public p61(r61 r61Var, o61 o61Var) {
        this.d = r61Var;
        this.c = o61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        j61 j61Var = this.d.Y2;
        o61 o61Var = this.c;
        if (j61Var == null) {
            return o61Var.J;
        }
        v51 G = j61Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? o61Var.J : i11;
    }
}

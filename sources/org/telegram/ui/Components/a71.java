package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class a71 extends g.p {
    public final /* synthetic */ z61 c;
    public final /* synthetic */ c71 d;

    public a71(c71 c71Var, z61 z61Var) {
        this.d = c71Var;
        this.c = z61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        u61 u61Var = this.d.f3;
        z61 z61Var = this.c;
        if (u61Var == null) {
            return z61Var.J;
        }
        g61 G = u61Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? z61Var.J : i11;
    }
}

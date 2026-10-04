package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class n71 extends g.p {
    public final /* synthetic */ p71 c;

    public n71(p71 p71Var) {
        this.c = p71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        p71 p71Var = this.c;
        org.telegram.ui.Components.qz qzVar = p71Var.X;
        org.telegram.ui.Components.u61 u61Var = p71Var.d0;
        if (u61Var == null) {
            return qzVar.J;
        }
        org.telegram.ui.Components.g61 G = u61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? qzVar.J : i11;
    }
}

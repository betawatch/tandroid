package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class l71 extends g.p {
    public final /* synthetic */ n71 c;

    public l71(n71 n71Var) {
        this.c = n71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        n71 n71Var = this.c;
        org.telegram.ui.Components.pz pzVar = n71Var.X;
        org.telegram.ui.Components.l61 l61Var = n71Var.d0;
        if (l61Var == null) {
            return pzVar.J;
        }
        org.telegram.ui.Components.x51 G = l61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? pzVar.J : i11;
    }
}

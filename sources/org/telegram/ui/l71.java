package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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

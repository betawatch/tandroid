package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        org.telegram.ui.Components.qz qzVar = n71Var.X;
        org.telegram.ui.Components.w61 w61Var = n71Var.d0;
        if (w61Var == null) {
            return qzVar.J;
        }
        org.telegram.ui.Components.h61 G = w61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? qzVar.J : i11;
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        org.telegram.ui.Components.oz ozVar = n71Var.X;
        org.telegram.ui.Components.j61 j61Var = n71Var.d0;
        if (j61Var == null) {
            return ozVar.J;
        }
        org.telegram.ui.Components.v51 G = j61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? ozVar.J : i11;
    }
}

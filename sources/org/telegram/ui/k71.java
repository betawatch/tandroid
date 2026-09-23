package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class k71 extends g.p {
    public final /* synthetic */ m71 c;

    public k71(m71 m71Var) {
        this.c = m71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        m71 m71Var = this.c;
        org.telegram.ui.Components.oz ozVar = m71Var.X;
        org.telegram.ui.Components.v51 v51Var = m71Var.d0;
        if (v51Var == null) {
            return ozVar.J;
        }
        org.telegram.ui.Components.h51 G = v51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? ozVar.J : i11;
    }
}

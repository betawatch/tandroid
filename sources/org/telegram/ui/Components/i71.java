package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i71 extends g.o {
    public final /* synthetic */ h71 c;
    public final /* synthetic */ k71 d;

    public i71(k71 k71Var, h71 h71Var) {
        this.d = k71Var;
        this.c = h71Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        c71 c71Var = this.d.W2;
        h71 h71Var = this.c;
        if (c71Var == null) {
            return h71Var.J;
        }
        p61 G = c71Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? h71Var.J : i11;
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class y61 extends g.o {
    public final /* synthetic */ x61 c;
    public final /* synthetic */ a71 d;

    public y61(a71 a71Var, x61 x61Var) {
        this.d = a71Var;
        this.c = x61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        s61 s61Var = this.d.W2;
        x61 x61Var = this.c;
        if (s61Var == null) {
            return x61Var.J;
        }
        f61 G = s61Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? x61Var.J : i11;
    }
}

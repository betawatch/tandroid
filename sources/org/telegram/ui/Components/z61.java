package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class z61 extends g.o {
    public final /* synthetic */ y61 c;
    public final /* synthetic */ b71 d;

    public z61(b71 b71Var, y61 y61Var) {
        this.d = b71Var;
        this.c = y61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        t61 t61Var = this.d.W2;
        y61 y61Var = this.c;
        if (t61Var == null) {
            return y61Var.J;
        }
        g61 G = t61Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? y61Var.J : i11;
    }
}

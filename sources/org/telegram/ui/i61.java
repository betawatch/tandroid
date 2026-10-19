package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class i61 extends g.o {
    public final /* synthetic */ k61 c;

    public i61(k61 k61Var) {
        this.c = k61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        k61 k61Var = this.c;
        org.telegram.ui.Components.wz wzVar = k61Var.X;
        org.telegram.ui.Components.t61 t61Var = k61Var.d0;
        if (t61Var == null) {
            return wzVar.J;
        }
        org.telegram.ui.Components.g61 G = t61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}

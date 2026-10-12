package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class f71 extends g.o {
    public final /* synthetic */ e71 c;
    public final /* synthetic */ h71 d;

    public f71(h71 h71Var, e71 e71Var) {
        this.d = h71Var;
        this.c = e71Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        z61 z61Var = this.d.W2;
        e71 e71Var = this.c;
        if (z61Var == null) {
            return e71Var.J;
        }
        l61 G = z61Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? e71Var.J : i11;
    }
}

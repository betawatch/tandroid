package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c81 extends g.o {
    public final /* synthetic */ e81 c;

    public c81(e81 e81Var) {
        this.c = e81Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        e81 e81Var = this.c;
        org.telegram.ui.Components.zz zzVar = e81Var.X;
        org.telegram.ui.Components.z61 z61Var = e81Var.d0;
        if (z61Var == null) {
            return zzVar.J;
        }
        org.telegram.ui.Components.l61 G = z61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? zzVar.J : i11;
    }
}

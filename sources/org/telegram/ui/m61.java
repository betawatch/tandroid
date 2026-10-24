package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class m61 extends g.o {
    public final /* synthetic */ o61 c;

    public m61(o61 o61Var) {
        this.c = o61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        o61 o61Var = this.c;
        org.telegram.ui.Components.wz wzVar = o61Var.X;
        org.telegram.ui.Components.b71 b71Var = o61Var.d0;
        if (b71Var == null) {
            return wzVar.J;
        }
        org.telegram.ui.Components.m61 G = b71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}

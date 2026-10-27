package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q61 extends g.o {
    public final /* synthetic */ s61 c;

    public q61(s61 s61Var) {
        this.c = s61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        s61 s61Var = this.c;
        org.telegram.ui.Components.vz vzVar = s61Var.X;
        org.telegram.ui.Components.k71 k71Var = s61Var.d0;
        if (k71Var == null) {
            return vzVar.J;
        }
        org.telegram.ui.Components.u61 G = k71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? vzVar.J : i11;
    }
}

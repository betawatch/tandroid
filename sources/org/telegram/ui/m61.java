package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

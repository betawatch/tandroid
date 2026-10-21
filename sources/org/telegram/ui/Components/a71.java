package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class a71 extends g.o {
    public final /* synthetic */ z61 c;
    public final /* synthetic */ c71 d;

    public a71(c71 c71Var, z61 z61Var) {
        this.d = c71Var;
        this.c = z61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        u61 u61Var = this.d.W2;
        z61 z61Var = this.c;
        if (u61Var == null) {
            return z61Var.J;
        }
        h61 G = u61Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? z61Var.J : i11;
    }
}

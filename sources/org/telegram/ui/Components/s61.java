package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class s61 extends g.p {
    public final /* synthetic */ r61 c;
    public final /* synthetic */ u61 d;

    public s61(u61 u61Var, r61 r61Var) {
        this.d = u61Var;
        this.c = r61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        m61 m61Var = this.d.Y2;
        r61 r61Var = this.c;
        if (m61Var == null) {
            return r61Var.J;
        }
        y51 G = m61Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? r61Var.J : i11;
    }
}

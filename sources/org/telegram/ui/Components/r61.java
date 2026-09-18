package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class r61 extends g.p {
    public final /* synthetic */ q61 c;
    public final /* synthetic */ t61 d;

    public r61(t61 t61Var, q61 q61Var) {
        this.d = t61Var;
        this.c = q61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        l61 l61Var = this.d.Y2;
        q61 q61Var = this.c;
        if (l61Var == null) {
            return q61Var.J;
        }
        x51 G = l61Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? q61Var.J : i11;
    }
}

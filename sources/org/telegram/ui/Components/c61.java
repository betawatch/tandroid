package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c61 extends g.p {
    public final /* synthetic */ b61 c;
    public final /* synthetic */ e61 d;

    public c61(e61 e61Var, b61 b61Var) {
        this.d = e61Var;
        this.c = b61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        w51 w51Var = this.d.Y2;
        b61 b61Var = this.c;
        if (w51Var == null) {
            return b61Var.J;
        }
        i51 G = w51Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? b61Var.J : i11;
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s51 extends f2.v {
    public final /* synthetic */ r51 c;
    public final /* synthetic */ u51 d;

    public s51(u51 u51Var, r51 r51Var) {
        this.d = u51Var;
        this.c = r51Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        k51 k51Var = this.d.U2;
        r51 r51Var = this.c;
        if (k51Var == null) {
            return r51Var.J;
        }
        w41 G = k51Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? r51Var.J : i11;
    }
}

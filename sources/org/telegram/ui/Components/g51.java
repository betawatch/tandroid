package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g51 extends f2.x {
    public final /* synthetic */ f51 c;
    public final /* synthetic */ i51 d;

    public g51(i51 i51Var, f51 f51Var) {
        this.d = i51Var;
        this.c = f51Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        int i10;
        z41 z41Var = this.d.U2;
        f51 f51Var = this.c;
        if (z41Var == null) {
            return f51Var.J;
        }
        l41 G = z41Var.G(i9);
        return (G == null || (i10 = G.u) == -1) ? f51Var.J : i10;
    }
}

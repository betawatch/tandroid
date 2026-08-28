package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m61 extends f2.x {
    public final /* synthetic */ o61 c;

    public m61(o61 o61Var) {
        this.c = o61Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        int i10;
        o61 o61Var = this.c;
        org.telegram.ui.Components.zy zyVar = o61Var.T;
        org.telegram.ui.Components.z41 z41Var = o61Var.Z;
        if (z41Var == null) {
            return zyVar.J;
        }
        org.telegram.ui.Components.l41 G = z41Var.G(i9 - 1);
        return (G == null || (i10 = G.u) == -1) ? zyVar.J : i10;
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o61 extends f2.v {
    public final /* synthetic */ q61 c;

    public o61(q61 q61Var) {
        this.c = q61Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        q61 q61Var = this.c;
        org.telegram.ui.Components.iz izVar = q61Var.T;
        org.telegram.ui.Components.k51 k51Var = q61Var.Z;
        if (k51Var == null) {
            return izVar.J;
        }
        org.telegram.ui.Components.w41 G = k51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? izVar.J : i11;
    }
}

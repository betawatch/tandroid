package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i71 extends f2.v {
    public final /* synthetic */ k71 c;

    public i71(k71 k71Var) {
        this.c = k71Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        k71 k71Var = this.c;
        org.telegram.ui.Components.pz pzVar = k71Var.U;
        org.telegram.ui.Components.w51 w51Var = k71Var.a0;
        if (w51Var == null) {
            return pzVar.J;
        }
        org.telegram.ui.Components.h51 G = w51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? pzVar.J : i11;
    }
}

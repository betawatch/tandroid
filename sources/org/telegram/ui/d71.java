package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d71 extends f2.v {
    public final /* synthetic */ f71 c;

    public d71(f71 f71Var) {
        this.c = f71Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        f71 f71Var = this.c;
        org.telegram.ui.Components.pz pzVar = f71Var.U;
        org.telegram.ui.Components.x51 x51Var = f71Var.a0;
        if (x51Var == null) {
            return pzVar.J;
        }
        org.telegram.ui.Components.j51 G = x51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? pzVar.J : i11;
    }
}

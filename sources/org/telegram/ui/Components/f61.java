package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f61 extends f2.v {
    public final /* synthetic */ e61 c;
    public final /* synthetic */ i61 d;

    public f61(i61 i61Var, e61 e61Var) {
        this.d = i61Var;
        this.c = e61Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        x51 x51Var = this.d.V2;
        e61 e61Var = this.c;
        if (x51Var == null) {
            return e61Var.J;
        }
        j51 G = x51Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? e61Var.J : i11;
    }
}

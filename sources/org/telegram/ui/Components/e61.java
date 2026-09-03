package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e61 extends f2.v {
    public final /* synthetic */ d61 c;
    public final /* synthetic */ h61 d;

    public e61(h61 h61Var, d61 d61Var) {
        this.d = h61Var;
        this.c = d61Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        w51 w51Var = this.d.V2;
        d61 d61Var = this.c;
        if (w51Var == null) {
            return d61Var.J;
        }
        h51 G = w51Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? d61Var.J : i11;
    }
}

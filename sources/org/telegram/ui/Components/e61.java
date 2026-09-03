package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e61 extends f2.v {
    public final /* synthetic */ d61 c;
    public final /* synthetic */ g61 d;

    public e61(g61 g61Var, d61 d61Var) {
        this.d = g61Var;
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
        i51 G = w51Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? d61Var.J : i11;
    }
}

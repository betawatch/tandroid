package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d61 extends g.p {
    public final /* synthetic */ c61 c;
    public final /* synthetic */ f61 d;

    public d61(f61 f61Var, c61 c61Var) {
        this.d = f61Var;
        this.c = c61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        x51 x51Var = this.d.Y2;
        c61 c61Var = this.c;
        if (x51Var == null) {
            return c61Var.J;
        }
        j51 G = x51Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? c61Var.J : i11;
    }
}

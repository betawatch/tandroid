package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i51 extends f2.w {
    public final /* synthetic */ h51 c;
    public final /* synthetic */ k51 d;

    public i51(k51 k51Var, h51 h51Var) {
        this.d = k51Var;
        this.c = h51Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        int i11;
        b51 b51Var = this.d.U2;
        h51 h51Var = this.c;
        if (b51Var == null) {
            return h51Var.J;
        }
        n41 G = b51Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? h51Var.J : i11;
    }
}

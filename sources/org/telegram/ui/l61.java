package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l61 extends f2.w {
    public final /* synthetic */ n61 c;

    public l61(n61 n61Var) {
        this.c = n61Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        int i11;
        n61 n61Var = this.c;
        org.telegram.ui.Components.bz bzVar = n61Var.T;
        org.telegram.ui.Components.b51 b51Var = n61Var.Z;
        if (b51Var == null) {
            return bzVar.J;
        }
        org.telegram.ui.Components.n41 G = b51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? bzVar.J : i11;
    }
}

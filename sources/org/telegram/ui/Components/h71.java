package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class h71 extends g.o {
    public final /* synthetic */ g71 c;
    public final /* synthetic */ j71 d;

    public h71(j71 j71Var, g71 g71Var) {
        this.d = j71Var;
        this.c = g71Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        b71 b71Var = this.d.Z2;
        g71 g71Var = this.c;
        if (b71Var == null) {
            return g71Var.J;
        }
        m61 G = b71Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? g71Var.J : i11;
    }
}

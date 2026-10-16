package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g71 extends g.o {
    public final /* synthetic */ f71 c;
    public final /* synthetic */ i71 d;

    public g71(i71 i71Var, f71 f71Var) {
        this.d = i71Var;
        this.c = f71Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        a71 a71Var = this.d.W2;
        f71 f71Var = this.c;
        if (a71Var == null) {
            return f71Var.J;
        }
        m61 G = a71Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? f71Var.J : i11;
    }
}

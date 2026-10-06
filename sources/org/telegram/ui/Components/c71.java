package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class c71 extends g.p {
    public final /* synthetic */ b71 c;
    public final /* synthetic */ e71 d;

    public c71(e71 e71Var, b71 b71Var) {
        this.d = e71Var;
        this.c = b71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        w61 w61Var = this.d.f3;
        b71 b71Var = this.c;
        if (w61Var == null) {
            return b71Var.J;
        }
        h61 G = w61Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? b71Var.J : i11;
    }
}

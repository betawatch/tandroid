package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q71 extends g.o {
    public final /* synthetic */ p71 c;
    public final /* synthetic */ s71 d;

    public q71(s71 s71Var, p71 p71Var) {
        this.d = s71Var;
        this.c = p71Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        k71 k71Var = this.d.g3;
        p71 p71Var = this.c;
        if (k71Var == null) {
            return p71Var.J;
        }
        u61 G = k71Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? p71Var.J : i11;
    }
}

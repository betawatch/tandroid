package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c81 extends g.o {
    public final /* synthetic */ e81 c;

    public c81(e81 e81Var) {
        this.c = e81Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        e81 e81Var = this.c;
        org.telegram.ui.Components.zz zzVar = e81Var.X;
        org.telegram.ui.Components.a71 a71Var = e81Var.d0;
        if (a71Var == null) {
            return zzVar.J;
        }
        org.telegram.ui.Components.m61 G = a71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? zzVar.J : i11;
    }
}

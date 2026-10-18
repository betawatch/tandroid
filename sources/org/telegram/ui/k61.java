package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class k61 extends g.o {
    public final /* synthetic */ m61 c;

    public k61(m61 m61Var) {
        this.c = m61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        m61 m61Var = this.c;
        org.telegram.ui.Components.wz wzVar = m61Var.X;
        org.telegram.ui.Components.s61 s61Var = m61Var.d0;
        if (s61Var == null) {
            return wzVar.J;
        }
        org.telegram.ui.Components.f61 G = s61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}

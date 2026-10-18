package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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

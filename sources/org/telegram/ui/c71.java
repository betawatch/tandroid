package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c71 extends f2.v {
    public final /* synthetic */ e71 c;

    public c71(e71 e71Var) {
        this.c = e71Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        e71 e71Var = this.c;
        org.telegram.ui.Components.nz nzVar = e71Var.U;
        org.telegram.ui.Components.w51 w51Var = e71Var.a0;
        if (w51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.i51 G = w51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}

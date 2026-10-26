package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p71 extends g.o {
    public final /* synthetic */ o71 c;
    public final /* synthetic */ r71 d;

    public p71(r71 r71Var, o71 o71Var) {
        this.d = r71Var;
        this.c = o71Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        j71 j71Var = this.d.g3;
        o71 o71Var = this.c;
        if (j71Var == null) {
            return o71Var.J;
        }
        t61 G = j71Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? o71Var.J : i11;
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n61 extends g.o {
    public final /* synthetic */ p61 c;

    public n61(p61 p61Var) {
        this.c = p61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        p61 p61Var = this.c;
        org.telegram.ui.Components.vz vzVar = p61Var.X;
        org.telegram.ui.Components.j71 j71Var = p61Var.d0;
        if (j71Var == null) {
            return vzVar.J;
        }
        org.telegram.ui.Components.t61 G = j71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? vzVar.J : i11;
    }
}

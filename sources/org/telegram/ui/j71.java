package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j71 extends f2.v {
    public final /* synthetic */ l71 c;

    public j71(l71 l71Var) {
        this.c = l71Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        l71 l71Var = this.c;
        org.telegram.ui.Components.nz nzVar = l71Var.U;
        org.telegram.ui.Components.w51 w51Var = l71Var.a0;
        if (w51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.i51 G = w51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}

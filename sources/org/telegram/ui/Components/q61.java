package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class q61 extends g.p {
    public final /* synthetic */ p61 c;
    public final /* synthetic */ s61 d;

    public q61(s61 s61Var, p61 p61Var) {
        this.d = s61Var;
        this.c = p61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        k61 k61Var = this.d.Y2;
        p61 p61Var = this.c;
        if (k61Var == null) {
            return p61Var.J;
        }
        w51 G = k61Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? p61Var.J : i11;
    }
}

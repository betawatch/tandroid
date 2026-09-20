package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class xp0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ uq0 d;

    public /* synthetic */ xp0(uq0 uq0Var, int i10) {
        this.c = i10;
        this.d = uq0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                qq0 qq0Var = this.d.M;
                return (i10 == qq0Var.w || i10 == qq0Var.x || i10 == qq0Var.y || i10 == qq0Var.F || qq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}

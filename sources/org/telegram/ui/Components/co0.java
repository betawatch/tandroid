package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class co0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ zo0 d;

    public /* synthetic */ co0(zo0 zo0Var, int i7) {
        this.c = i7;
        this.d = zo0Var;
    }

    @Override // g.p
    public final int i(int i7) {
        switch (this.c) {
            case 0:
                if (i7 == 0) {
                    return this.d.D1.J;
                }
                return 1;
            case 1:
                wo0 wo0Var = this.d.I1;
                return (i7 == wo0Var.x || i7 == wo0Var.y || i7 == wo0Var.E || i7 == wo0Var.G || wo0Var.d(i7) == 0) ? 4 : 1;
            default:
                if (i7 == 0) {
                    return this.d.E1.J;
                }
                return 1;
        }
    }
}

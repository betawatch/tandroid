package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class gq0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ dr0 d;

    public /* synthetic */ gq0(dr0 dr0Var, int i10) {
        this.c = i10;
        this.d = dr0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                zq0 zq0Var = this.d.M;
                return (i10 == zq0Var.w || i10 == zq0Var.x || i10 == zq0Var.y || i10 == zq0Var.F || zq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}

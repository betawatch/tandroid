package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pq0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ mr0 d;

    public /* synthetic */ pq0(mr0 mr0Var, int i10) {
        this.c = i10;
        this.d = mr0Var;
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
                ir0 ir0Var = this.d.M;
                return (i10 == ir0Var.w || i10 == ir0Var.x || i10 == ir0Var.y || i10 == ir0Var.F || ir0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}

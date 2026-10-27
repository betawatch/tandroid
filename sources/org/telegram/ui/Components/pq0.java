package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pq0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ nr0 d;

    public /* synthetic */ pq0(nr0 nr0Var, int i10) {
        this.c = i10;
        this.d = nr0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
            case 1:
                jr0 jr0Var = this.d.N;
                return (i10 == jr0Var.w || i10 == jr0Var.x || i10 == jr0Var.y || i10 == jr0Var.F || jr0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.J.J;
                }
                return 1;
        }
    }
}

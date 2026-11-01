package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qo0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ pp0 d;

    public /* synthetic */ qo0(pp0 pp0Var, int i10) {
        this.c = i10;
        this.d = pp0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.z1.J;
                }
                return 1;
            case 1:
                mp0 mp0Var = this.d.E1;
                return (i10 == mp0Var.x || i10 == mp0Var.y || i10 == mp0Var.D || i10 == mp0Var.F || mp0Var.d(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.A1.J;
                }
                return 1;
        }
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ep0 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ dq0 d;

    public /* synthetic */ ep0(dq0 dq0Var, int i10) {
        this.c = i10;
        this.d = dq0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.D.J;
                }
                return 1;
            case 1:
                zp0 zp0Var = this.d.I;
                return (i10 == zp0Var.w || i10 == zp0Var.x || i10 == zp0Var.y || i10 == zp0Var.B || zp0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.E.J;
                }
                return 1;
        }
    }
}

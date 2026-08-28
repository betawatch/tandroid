package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class to0 extends f2.x {
    public final /* synthetic */ int c;
    public final /* synthetic */ rp0 d;

    public /* synthetic */ to0(rp0 rp0Var, int i9) {
        this.c = i9;
        this.d = rp0Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        switch (this.c) {
            case 0:
                if (i9 == 0) {
                    return this.d.D.J;
                }
                return 1;
            case 1:
                np0 np0Var = this.d.I;
                return (i9 == np0Var.w || i9 == np0Var.x || i9 == np0Var.y || i9 == np0Var.B || np0Var.j(i9) == 0) ? 4 : 1;
            default:
                if (i9 == 0) {
                    return this.d.E.J;
                }
                return 1;
        }
    }
}

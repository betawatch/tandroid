package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class of0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf0 b;

    public /* synthetic */ of0(zf0 zf0Var, int i10) {
        this.a = i10;
        this.b = zf0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                zf0 zf0Var = this.b;
                zf0Var.c(true);
                zf0Var.s0.u1(0, true, null, true);
                break;
            default:
                this.b.s0.u1(0, true, null, true);
                break;
        }
    }
}

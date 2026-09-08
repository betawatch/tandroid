package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp0 b;

    public /* synthetic */ lp0(vp0 vp0Var, int i10) {
        this.a = i10;
        this.b = vp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        vp0 vp0Var = this.b;
        switch (i10) {
            case 0:
                if (vp0Var.G) {
                    vp0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                vp0Var.h();
                break;
            case 2:
                int i11 = vp0.q0;
                vp0Var.h();
                break;
            default:
                int i12 = vp0.q0;
                vp0Var.h();
                break;
        }
    }
}

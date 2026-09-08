package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ md b;

    public /* synthetic */ dd(md mdVar, int i10) {
        this.a = i10;
        this.b = mdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                md mdVar = this.b;
                mdVar.j0 = true;
                mdVar.h0();
                break;
            case 1:
                md mdVar2 = this.b;
                mdVar2.x = null;
                mdVar2.y = null;
                mdVar2.l0 = null;
                mdVar2.m0 = null;
                mdVar2.o0 = null;
                mdVar2.n0 = null;
                mdVar2.p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.e.h(null, null, mdVar2.s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.K(0);
                break;
            case 2:
                this.b.g0(true);
                break;
            default:
                md mdVar3 = this.b;
                mdVar3.j0 = true;
                if (mdVar3.w.length() > 0) {
                    mdVar3.d0(mdVar3.w.getText().toString());
                }
                mdVar3.h0();
                break;
        }
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nq implements rw0 {
    public final /* synthetic */ lq a;
    public final /* synthetic */ pq b;

    public nq(pq pqVar, lq lqVar) {
        this.b = pqVar;
        this.a = lqVar;
    }

    @Override // org.telegram.ui.Components.rw0
    public final void f(int i10) {
        pq pqVar = this.b;
        pqVar.r = i10;
        pqVar.r(true);
    }

    @Override // org.telegram.ui.Components.rw0
    public final void m() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        lq lqVar = this.a;
        lqVar.y(0 - lqVar.getScrollX(), measuredHeight - lqVar.getScrollY(), false);
    }
}

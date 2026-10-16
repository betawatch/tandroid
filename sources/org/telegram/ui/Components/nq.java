package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class nq implements rw0 {
    public final /* synthetic */ lq a;
    public final /* synthetic */ pq b;

    public nq(pq pqVar, lq lqVar) {
        this.b = pqVar;
        this.a = lqVar;
    }

    @Override // org.telegram.ui.Components.rw0
    public final void h(int i10) {
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

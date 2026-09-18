package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class aq implements ew0 {
    public final /* synthetic */ yp a;
    public final /* synthetic */ cq b;

    public aq(cq cqVar, yp ypVar) {
        this.b = cqVar;
        this.a = ypVar;
    }

    @Override // org.telegram.ui.Components.ew0
    public final void h(int i10) {
        cq cqVar = this.b;
        cqVar.r = i10;
        cqVar.p(true);
    }

    @Override // org.telegram.ui.Components.ew0
    public final void n() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        yp ypVar = this.a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}

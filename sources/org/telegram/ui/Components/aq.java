package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class aq implements sv0 {
    public final /* synthetic */ yp a;
    public final /* synthetic */ cq b;

    public aq(cq cqVar, yp ypVar) {
        this.b = cqVar;
        this.a = ypVar;
    }

    @Override // org.telegram.ui.Components.sv0
    public final void g(int i10) {
        cq cqVar = this.b;
        cqVar.r = i10;
        cqVar.p(true);
    }

    @Override // org.telegram.ui.Components.sv0
    public final void l() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        yp ypVar = this.a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}

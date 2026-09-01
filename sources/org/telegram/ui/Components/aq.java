package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class aq implements uv0 {
    public final /* synthetic */ yp a;
    public final /* synthetic */ cq b;

    public aq(cq cqVar, yp ypVar) {
        this.b = cqVar;
        this.a = ypVar;
    }

    @Override // org.telegram.ui.Components.uv0
    public final void i(int i10) {
        cq cqVar = this.b;
        cqVar.r = i10;
        cqVar.p(true);
    }

    @Override // org.telegram.ui.Components.uv0
    public final void m() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        yp ypVar = this.a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}

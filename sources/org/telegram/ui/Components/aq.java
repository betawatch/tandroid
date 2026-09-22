package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class aq implements fw0 {
    public final /* synthetic */ yp a;
    public final /* synthetic */ cq b;

    public aq(cq cqVar, yp ypVar) {
        this.b = cqVar;
        this.a = ypVar;
    }

    @Override // org.telegram.ui.Components.fw0
    public final void g(int i10) {
        cq cqVar = this.b;
        cqVar.r = i10;
        cqVar.p(true);
    }

    @Override // org.telegram.ui.Components.fw0
    public final void l() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        yp ypVar = this.a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}

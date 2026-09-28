package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class cq implements fw0 {
    public final /* synthetic */ aq a;
    public final /* synthetic */ eq b;

    public cq(eq eqVar, aq aqVar) {
        this.b = eqVar;
        this.a = aqVar;
    }

    @Override // org.telegram.ui.Components.fw0
    public final void h(int i10) {
        eq eqVar = this.b;
        eqVar.r = i10;
        eqVar.p(true);
    }

    @Override // org.telegram.ui.Components.fw0
    public final void n() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        aq aqVar = this.a;
        aqVar.y(0 - aqVar.getScrollX(), measuredHeight - aqVar.getScrollY(), false);
    }
}

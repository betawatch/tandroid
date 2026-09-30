package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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

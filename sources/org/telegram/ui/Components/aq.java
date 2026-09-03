package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class aq implements tv0 {
    public final /* synthetic */ yp a;
    public final /* synthetic */ cq b;

    public aq(cq cqVar, yp ypVar) {
        this.b = cqVar;
        this.a = ypVar;
    }

    @Override // org.telegram.ui.Components.tv0
    public final void i(int i10) {
        cq cqVar = this.b;
        cqVar.r = i10;
        cqVar.p(true);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void m() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        yp ypVar = this.a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}

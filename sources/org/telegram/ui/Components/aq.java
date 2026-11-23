package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class aq implements gu0 {
    public final /* synthetic */ yp a;
    public final /* synthetic */ cq b;

    public aq(cq cqVar, yp ypVar) {
        this.b = cqVar;
        this.a = ypVar;
    }

    @Override // org.telegram.ui.Components.gu0
    public final void k(int i7) {
        cq cqVar = this.b;
        cqVar.u1 = i7;
        cqVar.K0(true);
    }

    @Override // org.telegram.ui.Components.gu0
    public final void o() {
        int measuredHeight = this.b.o1.getMeasuredHeight();
        yp ypVar = this.a;
        ypVar.z(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}

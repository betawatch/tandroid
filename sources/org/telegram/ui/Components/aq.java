package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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

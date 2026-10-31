package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qp implements xu0 {
    public final /* synthetic */ op a;
    public final /* synthetic */ sp b;

    public qp(sp spVar, op opVar) {
        this.b = spVar;
        this.a = opVar;
    }

    @Override // org.telegram.ui.Components.xu0
    public final void m(int i10) {
        sp spVar = this.b;
        spVar.q1 = i10;
        spVar.J0(true);
    }

    @Override // org.telegram.ui.Components.xu0
    public final void s() {
        int measuredHeight = this.b.k1.getMeasuredHeight();
        op opVar = this.a;
        opVar.z(0 - opVar.getScrollX(), measuredHeight - opVar.getScrollY(), false);
    }
}

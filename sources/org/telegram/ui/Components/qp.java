package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qp implements yu0 {
    public final /* synthetic */ op a;
    public final /* synthetic */ sp b;

    public qp(sp spVar, op opVar) {
        this.b = spVar;
        this.a = opVar;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void m(int i10) {
        sp spVar = this.b;
        spVar.q1 = i10;
        spVar.J0(true);
    }

    @Override // org.telegram.ui.Components.yu0
    public final void r() {
        int measuredHeight = this.b.k1.getMeasuredHeight();
        op opVar = this.a;
        opVar.z(0 - opVar.getScrollX(), measuredHeight - opVar.getScrollY(), false);
    }
}

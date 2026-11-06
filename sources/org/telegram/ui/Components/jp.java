package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class jp implements ut0 {
    public final /* synthetic */ hp a;
    public final /* synthetic */ lp b;

    public jp(lp lpVar, hp hpVar) {
        this.b = lpVar;
        this.a = hpVar;
    }

    @Override // org.telegram.ui.Components.ut0
    public final void m(int i7) {
        lp lpVar = this.b;
        lpVar.q1 = i7;
        lpVar.J0(true);
    }

    @Override // org.telegram.ui.Components.ut0
    public final void n() {
        int measuredHeight = this.b.k1.getMeasuredHeight();
        hp hpVar = this.a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class kq implements rw0 {
    public final /* synthetic */ iq a;
    public final /* synthetic */ mq b;

    public kq(mq mqVar, iq iqVar) {
        this.b = mqVar;
        this.a = iqVar;
    }

    @Override // org.telegram.ui.Components.rw0
    public final void i(int i10) {
        mq mqVar = this.b;
        mqVar.s = i10;
        mqVar.q(true);
    }

    @Override // org.telegram.ui.Components.rw0
    public final void m() {
        int measuredHeight = this.b.d.getMeasuredHeight();
        iq iqVar = this.a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}

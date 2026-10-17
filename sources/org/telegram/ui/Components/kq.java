package org.telegram.ui.Components;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class kq implements mw0 {
    public final /* synthetic */ iq a;
    public final /* synthetic */ mq b;

    public kq(mq mqVar, iq iqVar) {
        this.b = mqVar;
        this.a = iqVar;
    }

    @Override // org.telegram.ui.Components.mw0
    public final void h(int i10) {
        mq mqVar = this.b;
        mqVar.r = i10;
        mqVar.q(true);
    }

    @Override // org.telegram.ui.Components.mw0
    public final void m() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        iq iqVar = this.a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}

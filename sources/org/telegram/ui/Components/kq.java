package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class kq implements ow0 {
    public final /* synthetic */ iq a;
    public final /* synthetic */ mq b;

    public kq(mq mqVar, iq iqVar) {
        this.b = mqVar;
        this.a = iqVar;
    }

    @Override // org.telegram.ui.Components.ow0
    public final void h(int i10) {
        mq mqVar = this.b;
        mqVar.r = i10;
        mqVar.q(true);
    }

    @Override // org.telegram.ui.Components.ow0
    public final void m() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        iq iqVar = this.a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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

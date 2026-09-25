package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class bq implements dw0 {
    public final /* synthetic */ zp a;
    public final /* synthetic */ dq b;

    public bq(dq dqVar, zp zpVar) {
        this.b = dqVar;
        this.a = zpVar;
    }

    @Override // org.telegram.ui.Components.dw0
    public final void h(int i10) {
        dq dqVar = this.b;
        dqVar.r = i10;
        dqVar.p(true);
    }

    @Override // org.telegram.ui.Components.dw0
    public final void n() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        zp zpVar = this.a;
        zpVar.y(0 - zpVar.getScrollX(), measuredHeight - zpVar.getScrollY(), false);
    }
}

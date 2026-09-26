package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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

package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class op implements cv0 {
    public final /* synthetic */ mp a;
    public final /* synthetic */ qp b;

    public op(qp qpVar, mp mpVar) {
        this.b = qpVar;
        this.a = mpVar;
    }

    @Override // org.telegram.ui.Components.cv0
    public final void j(int i10) {
        qp qpVar = this.b;
        qpVar.r = i10;
        qpVar.q(true);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void m() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        mp mpVar = this.a;
        mpVar.y(0 - mpVar.getScrollX(), measuredHeight - mpVar.getScrollY(), false);
    }
}

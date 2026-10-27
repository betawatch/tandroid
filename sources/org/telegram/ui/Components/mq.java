package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mq implements zw0 {
    public final /* synthetic */ kq a;
    public final /* synthetic */ oq b;

    public mq(oq oqVar, kq kqVar) {
        this.b = oqVar;
        this.a = kqVar;
    }

    @Override // org.telegram.ui.Components.zw0
    public final void j(int i10) {
        oq oqVar = this.b;
        oqVar.s = i10;
        oqVar.p(true);
    }

    @Override // org.telegram.ui.Components.zw0
    public final void m() {
        int measuredHeight = this.b.d.getMeasuredHeight();
        kq kqVar = this.a;
        kqVar.z(0 - kqVar.getScrollX(), measuredHeight - kqVar.getScrollY(), false);
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mq implements yw0 {
    public final /* synthetic */ kq a;
    public final /* synthetic */ oq b;

    public mq(oq oqVar, kq kqVar) {
        this.b = oqVar;
        this.a = kqVar;
    }

    @Override // org.telegram.ui.Components.yw0
    public final void j(int i10) {
        oq oqVar = this.b;
        oqVar.s = i10;
        oqVar.p(true);
    }

    @Override // org.telegram.ui.Components.yw0
    public final void m() {
        int measuredHeight = this.b.d.getMeasuredHeight();
        kq kqVar = this.a;
        kqVar.z(0 - kqVar.getScrollX(), measuredHeight - kqVar.getScrollY(), false);
    }
}

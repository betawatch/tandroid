package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gq implements dw0 {
    public final /* synthetic */ eq a;
    public final /* synthetic */ iq b;

    public gq(iq iqVar, eq eqVar) {
        this.b = iqVar;
        this.a = eqVar;
    }

    @Override // org.telegram.ui.Components.dw0
    public final void h(int i10) {
        iq iqVar = this.b;
        iqVar.r = i10;
        iqVar.p(true);
    }

    @Override // org.telegram.ui.Components.dw0
    public final void l() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        eq eqVar = this.a;
        eqVar.y(0 - eqVar.getScrollX(), measuredHeight - eqVar.getScrollY(), false);
    }
}

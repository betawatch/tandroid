package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qq implements vw0 {
    public final /* synthetic */ oq a;
    public final /* synthetic */ sq b;

    public qq(sq sqVar, oq oqVar) {
        this.b = sqVar;
        this.a = oqVar;
    }

    @Override // org.telegram.ui.Components.vw0
    public final void g(int i10) {
        sq sqVar = this.b;
        sqVar.r = i10;
        sqVar.r(true);
    }

    @Override // org.telegram.ui.Components.vw0
    public final void l() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        oq oqVar = this.a;
        oqVar.y(0 - oqVar.getScrollX(), measuredHeight - oqVar.getScrollY(), false);
    }
}

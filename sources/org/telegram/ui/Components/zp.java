package org.telegram.ui.Components;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class zp implements rv0 {
    public final /* synthetic */ xp a;
    public final /* synthetic */ bq b;

    public zp(bq bqVar, xp xpVar) {
        this.b = bqVar;
        this.a = xpVar;
    }

    @Override // org.telegram.ui.Components.rv0
    public final void i(int i10) {
        bq bqVar = this.b;
        bqVar.r = i10;
        bqVar.p(true);
    }

    @Override // org.telegram.ui.Components.rv0
    public final void l() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        xp xpVar = this.a;
        xpVar.y(0 - xpVar.getScrollX(), measuredHeight - xpVar.getScrollY(), false);
    }
}

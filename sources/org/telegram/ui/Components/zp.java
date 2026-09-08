package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

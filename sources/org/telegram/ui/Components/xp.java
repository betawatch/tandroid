package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xp implements tv0 {
    public final /* synthetic */ vp a;
    public final /* synthetic */ zp b;

    public xp(zp zpVar, vp vpVar) {
        this.b = zpVar;
        this.a = vpVar;
    }

    @Override // org.telegram.ui.Components.tv0
    public final void g(int i10) {
        zp zpVar = this.b;
        zpVar.r = i10;
        zpVar.p(true);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void j() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        vp vpVar = this.a;
        vpVar.y(0 - vpVar.getScrollX(), measuredHeight - vpVar.getScrollY(), false);
    }
}

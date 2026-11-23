package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xp implements fu0 {
    public final /* synthetic */ vp a;
    public final /* synthetic */ zp b;

    public xp(zp zpVar, vp vpVar) {
        this.b = zpVar;
        this.a = vpVar;
    }

    @Override // org.telegram.ui.Components.fu0
    public final void n(int i7) {
        zp zpVar = this.b;
        zpVar.u1 = i7;
        zpVar.K0(true);
    }

    @Override // org.telegram.ui.Components.fu0
    public final void o() {
        int measuredHeight = this.b.o1.getMeasuredHeight();
        vp vpVar = this.a;
        vpVar.z(0 - vpVar.getScrollX(), measuredHeight - vpVar.getScrollY(), false);
    }
}

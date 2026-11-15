package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rp implements vt0 {
    public final /* synthetic */ pp a;
    public final /* synthetic */ tp b;

    public rp(tp tpVar, pp ppVar) {
        this.b = tpVar;
        this.a = ppVar;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void l(int i7) {
        tp tpVar = this.b;
        tpVar.u1 = i7;
        tpVar.J0(true);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void p() {
        int measuredHeight = this.b.o1.getMeasuredHeight();
        pp ppVar = this.a;
        ppVar.z(0 - ppVar.getScrollX(), measuredHeight - ppVar.getScrollY(), false);
    }
}

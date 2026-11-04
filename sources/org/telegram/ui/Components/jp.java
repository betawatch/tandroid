package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jp implements tt0 {
    public final /* synthetic */ hp a;
    public final /* synthetic */ lp b;

    public jp(lp lpVar, hp hpVar) {
        this.b = lpVar;
        this.a = hpVar;
    }

    @Override // org.telegram.ui.Components.tt0
    public final void l(int i3) {
        lp lpVar = this.b;
        lpVar.r1 = i3;
        lpVar.J0(true);
    }

    @Override // org.telegram.ui.Components.tt0
    public final void p() {
        int measuredHeight = this.b.l1.getMeasuredHeight();
        hp hpVar = this.a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}

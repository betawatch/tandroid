package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jp implements vt0 {
    public final /* synthetic */ hp a;
    public final /* synthetic */ lp b;

    public jp(lp lpVar, hp hpVar) {
        this.b = lpVar;
        this.a = hpVar;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void m(int i7) {
        lp lpVar = this.b;
        lpVar.t1 = i7;
        lpVar.J0(true);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void n() {
        int measuredHeight = this.b.n1.getMeasuredHeight();
        hp hpVar = this.a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}

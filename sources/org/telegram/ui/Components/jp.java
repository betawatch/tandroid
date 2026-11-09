package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jp implements wt0 {
    public final /* synthetic */ hp a;
    public final /* synthetic */ lp b;

    public jp(lp lpVar, hp hpVar) {
        this.b = lpVar;
        this.a = hpVar;
    }

    @Override // org.telegram.ui.Components.wt0
    public final void m(int i7) {
        lp lpVar = this.b;
        lpVar.q1 = i7;
        lpVar.J0(true);
    }

    @Override // org.telegram.ui.Components.wt0
    public final void n() {
        int measuredHeight = this.b.k1.getMeasuredHeight();
        hp hpVar = this.a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}

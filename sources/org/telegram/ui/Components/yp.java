package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yp implements tv0 {
    public final /* synthetic */ wp a;
    public final /* synthetic */ aq b;

    public yp(aq aqVar, wp wpVar) {
        this.b = aqVar;
        this.a = wpVar;
    }

    @Override // org.telegram.ui.Components.tv0
    public final void h(int i10) {
        aq aqVar = this.b;
        aqVar.r = i10;
        aqVar.p(true);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void m() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        wp wpVar = this.a;
        wpVar.y(0 - wpVar.getScrollX(), measuredHeight - wpVar.getScrollY(), false);
    }
}

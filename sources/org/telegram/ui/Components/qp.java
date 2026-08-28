package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qp implements av0 {
    public final /* synthetic */ op a;
    public final /* synthetic */ sp b;

    public qp(sp spVar, op opVar) {
        this.b = spVar;
        this.a = opVar;
    }

    @Override // org.telegram.ui.Components.av0
    public final void h(int i9) {
        sp spVar = this.b;
        spVar.r = i9;
        spVar.p(true);
    }

    @Override // org.telegram.ui.Components.av0
    public final void m() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        op opVar = this.a;
        opVar.y(0 - opVar.getScrollX(), measuredHeight - opVar.getScrollY(), false);
    }
}

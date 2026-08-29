package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class up implements kv0 {
    public final /* synthetic */ sp a;
    public final /* synthetic */ wp b;

    public up(wp wpVar, sp spVar) {
        this.b = wpVar;
        this.a = spVar;
    }

    @Override // org.telegram.ui.Components.kv0
    public final void h(int i10) {
        wp wpVar = this.b;
        wpVar.r = i10;
        wpVar.p(true);
    }

    @Override // org.telegram.ui.Components.kv0
    public final void m() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        sp spVar = this.a;
        spVar.y(0 - spVar.getScrollX(), measuredHeight - spVar.getScrollY(), false);
    }
}

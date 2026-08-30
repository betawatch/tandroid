package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lc1 extends cd1 {
    public final /* synthetic */ xn h2;
    public final /* synthetic */ boolean i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc1(Object obj, xn xnVar, boolean z4) {
        super(obj, null, true);
        this.h2 = xnVar;
        this.i2 = z4;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        vn vnVar = this.h2.ba;
        vnVar.i(vnVar.f, vnVar.h, false, Boolean.valueOf(this.i2), false);
    }
}

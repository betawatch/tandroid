package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ed1 extends vd1 {
    public final /* synthetic */ zn k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed1(Object obj, zn znVar, boolean z10) {
        super(obj, null, true);
        this.k2 = znVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xn xnVar = this.k2.ea;
        xnVar.i(xnVar.f, xnVar.h, false, Boolean.valueOf(this.l2), false);
    }
}

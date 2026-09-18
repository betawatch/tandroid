package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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

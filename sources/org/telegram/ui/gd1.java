package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gd1 extends xd1 {
    public final /* synthetic */ zn k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd1(Object obj, zn znVar, boolean z10) {
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

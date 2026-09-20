package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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

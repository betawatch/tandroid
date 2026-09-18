package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gd1 extends xd1 {
    public final /* synthetic */ bo k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd1(Object obj, bo boVar, boolean z10) {
        super(obj, null, true);
        this.k2 = boVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zn znVar = this.k2.ea;
        znVar.i(znVar.f, znVar.h, false, Boolean.valueOf(this.l2), false);
    }
}

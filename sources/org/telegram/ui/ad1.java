package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ad1 extends rd1 {
    public final /* synthetic */ yn k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad1(Object obj, yn ynVar, boolean z10) {
        super(obj, null, true);
        this.k2 = ynVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        wn wnVar = this.k2.ca;
        wnVar.i(wnVar.f, wnVar.h, false, Boolean.valueOf(this.l2), false);
    }
}

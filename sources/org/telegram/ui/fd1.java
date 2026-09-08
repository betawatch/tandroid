package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class fd1 extends wd1 {
    public final /* synthetic */ co k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(Object obj, co coVar, boolean z10) {
        super(obj, null, true);
        this.k2 = coVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ao aoVar = this.k2.ea;
        aoVar.i(aoVar.f, aoVar.h, false, Boolean.valueOf(this.l2), false);
    }
}

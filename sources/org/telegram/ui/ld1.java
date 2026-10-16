package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ld1 extends ce1 {
    public final /* synthetic */ fo k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld1(Object obj, fo foVar, boolean z10) {
        super(obj, null, true);
        this.k2 = foVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        co coVar = this.k2.ea;
        coVar.i(coVar.f, coVar.h, false, Boolean.valueOf(this.l2), false);
    }
}

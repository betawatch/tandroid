package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fd1 extends wd1 {
    public final /* synthetic */ bo k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(Object obj, bo boVar, boolean z10) {
        super(obj, null, true);
        this.k2 = boVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zn znVar = this.k2.ea;
        znVar.i(znVar.f, znVar.h, false, Boolean.valueOf(this.l2), false);
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e71 extends v71 {
    public final /* synthetic */ bn m2;
    public final /* synthetic */ boolean n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e71(Object obj, bn bnVar, boolean z10) {
        super(obj, null, true);
        this.m2 = bnVar;
        this.n2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zm zmVar = this.m2.Ba;
        zmVar.r(zmVar.f, zmVar.g, false, Boolean.valueOf(this.n2), false);
    }
}

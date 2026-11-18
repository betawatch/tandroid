package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g71 extends x71 {
    public final /* synthetic */ bn m2;
    public final /* synthetic */ boolean n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(Object obj, bn bnVar, boolean z10) {
        super(obj, null, true);
        this.m2 = bnVar;
        this.n2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zm zmVar = this.m2.Ba;
        zmVar.r(zmVar.f, zmVar.g, false, Boolean.valueOf(this.n2), false);
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

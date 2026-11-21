package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zm zmVar = this.m2.Ba;
        zmVar.r(zmVar.f, zmVar.g, false, Boolean.valueOf(this.n2), false);
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f71 extends v71 {
    public final /* synthetic */ an l2;
    public final /* synthetic */ boolean m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(Object obj, an anVar, boolean z9) {
        super(obj, null, true);
        this.l2 = anVar;
        this.m2 = z9;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ym ymVar = this.l2.xa;
        ymVar.r(ymVar.f, ymVar.g, false, Boolean.valueOf(this.m2), false);
    }
}

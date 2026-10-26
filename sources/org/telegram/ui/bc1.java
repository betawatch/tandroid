package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bc1 extends tc1 {
    public final /* synthetic */ un l2;
    public final /* synthetic */ boolean m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc1(Object obj, un unVar, boolean z10) {
        super(obj, null, true);
        this.l2 = unVar;
        this.m2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        sn snVar = this.l2.qa;
        snVar.q(snVar.f, snVar.g, false, Boolean.valueOf(this.m2), false);
    }
}

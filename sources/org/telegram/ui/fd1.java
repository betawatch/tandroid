package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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

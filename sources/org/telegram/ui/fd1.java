package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

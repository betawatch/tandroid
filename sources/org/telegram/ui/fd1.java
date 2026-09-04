package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

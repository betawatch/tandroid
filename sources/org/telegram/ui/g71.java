package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g71 extends w71 {
    public final /* synthetic */ cn l2;
    public final /* synthetic */ boolean m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(Object obj, cn cnVar, boolean z9) {
        super(obj, null, true);
        this.l2 = cnVar;
        this.m2 = z9;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        an anVar = this.l2.za;
        anVar.r(anVar.f, anVar.g, false, Boolean.valueOf(this.m2), false);
    }
}

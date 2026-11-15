package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c71 extends t71 {
    public final /* synthetic */ an m2;
    public final /* synthetic */ boolean n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c71(Object obj, an anVar, boolean z10) {
        super(obj, null, true);
        this.m2 = anVar;
        this.n2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ym ymVar = this.m2.Aa;
        ymVar.r(ymVar.f, ymVar.g, false, Boolean.valueOf(this.n2), false);
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e71 extends u71 {
    public final /* synthetic */ an l2;
    public final /* synthetic */ boolean m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e71(Object obj, an anVar, boolean z9) {
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

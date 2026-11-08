package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

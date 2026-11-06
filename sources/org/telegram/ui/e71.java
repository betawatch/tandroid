package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

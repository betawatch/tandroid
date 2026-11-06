package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f71 implements m71 {
    public boolean a;
    public final /* synthetic */ an b;

    public f71(an anVar, boolean z9) {
        this.b = anVar;
        this.a = z9;
    }

    @Override // org.telegram.ui.m71
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.m71
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.m71
    public final void t1(boolean z9) {
        boolean z10 = !this.a;
        this.a = z10;
        ym ymVar = this.b.xa;
        ymVar.r(ymVar.f, ymVar.g, z9, Boolean.valueOf(z10), false);
    }
}

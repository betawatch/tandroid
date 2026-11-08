package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g71 implements n71 {
    public boolean a;
    public final /* synthetic */ an b;

    public g71(an anVar, boolean z9) {
        this.b = anVar;
        this.a = z9;
    }

    @Override // org.telegram.ui.n71
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.n71
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.n71
    public final void t1(boolean z9) {
        boolean z10 = !this.a;
        this.a = z10;
        ym ymVar = this.b.xa;
        ymVar.r(ymVar.f, ymVar.g, z9, Boolean.valueOf(z10), false);
    }
}

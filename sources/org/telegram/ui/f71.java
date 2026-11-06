package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

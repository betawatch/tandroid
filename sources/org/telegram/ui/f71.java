package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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

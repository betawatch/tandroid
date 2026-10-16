package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class md1 implements td1 {
    public boolean a;
    public final /* synthetic */ fo b;

    public md1(fo foVar, boolean z10) {
        this.b = foVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.td1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.td1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.td1
    public final void o1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        co coVar = this.b.ea;
        coVar.i(coVar.f, coVar.h, z10, Boolean.valueOf(z11), false);
    }
}

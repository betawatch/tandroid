package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ac1 implements hc1 {
    public boolean a;
    public final /* synthetic */ sn b;

    public ac1(sn snVar, boolean z10) {
        this.b = snVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.hc1
    public final boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.hc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.hc1
    public final void c1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        qn qnVar = this.b.qa;
        qnVar.q(qnVar.f, qnVar.g, z10, Boolean.valueOf(z11), false);
    }
}

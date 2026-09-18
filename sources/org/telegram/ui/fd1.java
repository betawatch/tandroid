package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class fd1 implements md1 {
    public boolean a;
    public final /* synthetic */ zn b;

    public fd1(zn znVar, boolean z10) {
        this.b = znVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.md1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.md1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.md1
    public final void o1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        xn xnVar = this.b.ea;
        xnVar.i(xnVar.f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}

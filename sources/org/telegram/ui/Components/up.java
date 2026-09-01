package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class up implements m2.f {
    public int a;
    public final /* synthetic */ xh0 b;

    public up(xh0 xh0Var) {
        this.b = xh0Var;
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        if (i10 == this.b.getCurrentItem() && f10 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // m2.f
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.a = i10;
    }

    public final void d() {
        xh0 xh0Var = this.b;
        if (xh0Var.t0 != null) {
            int currentItem = xh0Var.getCurrentItem();
            int k10 = xh0Var.t0.k(currentItem) + xh0Var.t0.j();
            if (currentItem != k10) {
                xh0Var.x(k10, false);
            }
        }
    }

    @Override // m2.f
    public final void a(int i10) {
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

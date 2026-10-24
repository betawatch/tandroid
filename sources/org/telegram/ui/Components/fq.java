package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class fq implements z4.f {
    public int a;
    public final /* synthetic */ oi0 b;

    public fq(oi0 oi0Var) {
        this.b = oi0Var;
    }

    @Override // z4.f
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.b.getCurrentItem() && f7 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // z4.f
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.a = i10;
    }

    public final void d() {
        oi0 oi0Var = this.b;
        if (oi0Var.w0 != null) {
            int currentItem = oi0Var.getCurrentItem();
            int k10 = oi0Var.w0.k(currentItem) + oi0Var.w0.j();
            if (currentItem != k10) {
                oi0Var.x(k10, false);
            }
        }
    }

    @Override // z4.f
    public final void a(int i10) {
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class eq implements z4.e {
    public int a;
    public final /* synthetic */ ki0 b;

    public eq(ki0 ki0Var) {
        this.b = ki0Var;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        if (i10 == this.b.getCurrentItem() && f7 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.a = i10;
    }

    public final void d() {
        ki0 ki0Var = this.b;
        if (ki0Var.w0 != null) {
            int currentItem = ki0Var.getCurrentItem();
            int k10 = ki0Var.w0.k(currentItem) + ki0Var.w0.j();
            if (currentItem != k10) {
                ki0Var.x(k10, false);
            }
        }
    }

    @Override // z4.e
    public final void b(int i10) {
    }
}

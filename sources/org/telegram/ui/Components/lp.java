package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lp implements z4.e {
    public int a;
    public final /* synthetic */ vg0 b;

    public lp(vg0 vg0Var) {
        this.b = vg0Var;
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
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
        vg0 vg0Var = this.b;
        if (vg0Var.w0 != null) {
            int currentItem = vg0Var.getCurrentItem();
            int k10 = vg0Var.w0.k(currentItem) + vg0Var.w0.j();
            if (currentItem != k10) {
                vg0Var.x(k10, false);
            }
        }
    }

    @Override // z4.e
    public final void a(int i10) {
    }
}

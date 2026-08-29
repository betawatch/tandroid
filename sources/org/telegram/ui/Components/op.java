package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class op implements m2.e {
    public int a;
    public final /* synthetic */ kh0 b;

    public op(kh0 kh0Var) {
        this.b = kh0Var;
    }

    @Override // m2.e
    public final void b(float f9, int i10, int i11) {
        if (i10 == this.b.getCurrentItem() && f9 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // m2.e
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.a = i10;
    }

    public final void d() {
        kh0 kh0Var = this.b;
        if (kh0Var.s0 != null) {
            int currentItem = kh0Var.getCurrentItem();
            int k9 = kh0Var.s0.k(currentItem) + kh0Var.s0.j();
            if (currentItem != k9) {
                kh0Var.x(k9, false);
            }
        }
    }

    @Override // m2.e
    public final void a(int i10) {
    }
}

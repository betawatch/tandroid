package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hq implements z4.e {
    public int a;
    public final /* synthetic */ pi0 b;

    public hq(pi0 pi0Var) {
        this.b = pi0Var;
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
        pi0 pi0Var = this.b;
        if (pi0Var.w0 != null) {
            int currentItem = pi0Var.getCurrentItem();
            int k10 = pi0Var.w0.k(currentItem) + pi0Var.w0.j();
            if (currentItem != k10) {
                pi0Var.x(k10, false);
            }
        }
    }

    @Override // z4.e
    public final void b(int i10) {
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class vp implements c5.h {
    public int a;
    public final /* synthetic */ hg0 b;

    public vp(hg0 hg0Var) {
        this.b = hg0Var;
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.b.getCurrentItem() && f10 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // c5.h
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.a = i7;
    }

    public final void d() {
        hg0 hg0Var = this.b;
        if (hg0Var.x0 != null) {
            int currentItem = hg0Var.getCurrentItem();
            int k10 = hg0Var.x0.k(currentItem) + hg0Var.x0.j();
            if (currentItem != k10) {
                hg0Var.x(k10, false);
            }
        }
    }

    @Override // c5.h
    public final void a(int i7) {
    }
}

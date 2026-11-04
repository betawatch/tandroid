package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dp implements b5.h {
    public int a;
    public final /* synthetic */ vf0 b;

    public dp(vf0 vf0Var) {
        this.b = vf0Var;
    }

    @Override // b5.h
    public final void b(float f10, int i3, int i10) {
        if (i3 == this.b.getCurrentItem() && f10 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // b5.h
    public final void c(int i3) {
        if (i3 == 0) {
            d();
        }
        this.a = i3;
    }

    public final void d() {
        vf0 vf0Var = this.b;
        if (vf0Var.x0 != null) {
            int currentItem = vf0Var.getCurrentItem();
            int k10 = vf0Var.x0.k(currentItem) + vf0Var.x0.j();
            if (currentItem != k10) {
                vf0Var.x(k10, false);
            }
        }
    }

    @Override // b5.h
    public final void a(int i3) {
    }
}

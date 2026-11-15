package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class mp implements c5.h {
    public int a;
    public final /* synthetic */ vf0 b;

    public mp(vf0 vf0Var) {
        this.b = vf0Var;
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
        vf0 vf0Var = this.b;
        if (vf0Var.x0 != null) {
            int currentItem = vf0Var.getCurrentItem();
            int k10 = vf0Var.x0.k(currentItem) + vf0Var.x0.j();
            if (currentItem != k10) {
                vf0Var.x(k10, false);
            }
        }
    }

    @Override // c5.h
    public final void a(int i7) {
    }
}

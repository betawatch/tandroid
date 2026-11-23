package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sp implements c5.h {
    public int a;
    public final /* synthetic */ gg0 b;

    public sp(gg0 gg0Var) {
        this.b = gg0Var;
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
        gg0 gg0Var = this.b;
        if (gg0Var.x0 != null) {
            int currentItem = gg0Var.getCurrentItem();
            int k10 = gg0Var.x0.k(currentItem) + gg0Var.x0.j();
            if (currentItem != k10) {
                gg0Var.x(k10, false);
            }
        }
    }

    @Override // c5.h
    public final void a(int i7) {
    }
}

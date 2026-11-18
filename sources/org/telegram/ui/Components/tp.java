package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tp implements c5.h {
    public int a;
    public final /* synthetic */ fg0 b;

    public tp(fg0 fg0Var) {
        this.b = fg0Var;
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
        fg0 fg0Var = this.b;
        if (fg0Var.x0 != null) {
            int currentItem = fg0Var.getCurrentItem();
            int k10 = fg0Var.x0.k(currentItem) + fg0Var.x0.j();
            if (currentItem != k10) {
                fg0Var.x(k10, false);
            }
        }
    }

    @Override // c5.h
    public final void a(int i7) {
    }
}

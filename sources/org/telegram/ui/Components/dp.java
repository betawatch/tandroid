package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dp implements c5.g {
    public int a;
    public final /* synthetic */ tf0 b;

    public dp(tf0 tf0Var) {
        this.b = tf0Var;
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.b.getCurrentItem() && f10 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // c5.g
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.a = i7;
    }

    public final void d() {
        tf0 tf0Var = this.b;
        if (tf0Var.w0 != null) {
            int currentItem = tf0Var.getCurrentItem();
            int k10 = tf0Var.w0.k(currentItem) + tf0Var.w0.j();
            if (currentItem != k10) {
                tf0Var.x(k10, false);
            }
        }
    }

    @Override // c5.g
    public final void a(int i7) {
    }
}

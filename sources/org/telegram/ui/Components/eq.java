package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class eq implements z4.e {
    public int a;
    public final /* synthetic */ li0 b;

    public eq(li0 li0Var) {
        this.b = li0Var;
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
        li0 li0Var = this.b;
        if (li0Var.w0 != null) {
            int currentItem = li0Var.getCurrentItem();
            int k10 = li0Var.w0.k(currentItem) + li0Var.w0.j();
            if (currentItem != k10) {
                li0Var.x(k10, false);
            }
        }
    }

    @Override // z4.e
    public final void b(int i10) {
    }
}

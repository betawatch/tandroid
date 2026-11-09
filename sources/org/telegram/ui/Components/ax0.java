package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ax0 extends ex0 {
    public int d;

    @Override // org.telegram.ui.Components.ex0
    public final int a(nx0 nx0Var, gx0 gx0Var, zw0 zw0Var, int i7, boolean z9) {
        return Math.max(0, this.a - zw0Var.a(gx0Var, i7));
    }

    @Override // org.telegram.ui.Components.ex0
    public final void b(int i7, int i10) {
        super.b(i7, i10);
        this.d = Math.max(this.d, i7 + i10);
    }

    @Override // org.telegram.ui.Components.ex0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.ex0
    public final int d(boolean z9) {
        return Math.max(super.d(z9), this.d);
    }
}

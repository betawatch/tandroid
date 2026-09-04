package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class wy0 extends az0 {
    public int d;

    @Override // org.telegram.ui.Components.az0
    public final int a(jz0 jz0Var, cz0 cz0Var, vy0 vy0Var, int i10, boolean z10) {
        return Math.max(0, this.a - vy0Var.a(cz0Var, i10));
    }

    @Override // org.telegram.ui.Components.az0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.az0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.az0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

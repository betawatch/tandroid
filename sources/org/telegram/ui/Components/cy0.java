package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cy0 extends gy0 {
    public int d;

    @Override // org.telegram.ui.Components.gy0
    public final int a(py0 py0Var, iy0 iy0Var, by0 by0Var, int i10, boolean z10) {
        return Math.max(0, this.a - by0Var.a(iy0Var, i10));
    }

    @Override // org.telegram.ui.Components.gy0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.gy0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.gy0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

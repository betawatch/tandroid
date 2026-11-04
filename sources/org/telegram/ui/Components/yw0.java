package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yw0 extends cx0 {
    public int d;

    @Override // org.telegram.ui.Components.cx0
    public final int a(lx0 lx0Var, ex0 ex0Var, xw0 xw0Var, int i3, boolean z10) {
        return Math.max(0, this.a - xw0Var.a(ex0Var, i3));
    }

    @Override // org.telegram.ui.Components.cx0
    public final void b(int i3, int i10) {
        super.b(i3, i10);
        this.d = Math.max(this.d, i3 + i10);
    }

    @Override // org.telegram.ui.Components.cx0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.cx0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

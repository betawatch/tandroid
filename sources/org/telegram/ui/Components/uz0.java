package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class uz0 extends yz0 {
    public int d;

    @Override // org.telegram.ui.Components.yz0
    public final int a(h01 h01Var, a01 a01Var, tz0 tz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - tz0Var.a(a01Var, i10));
    }

    @Override // org.telegram.ui.Components.yz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.yz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.yz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

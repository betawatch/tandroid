package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kx0 extends ox0 {
    public int d;

    @Override // org.telegram.ui.Components.ox0
    public final int a(xx0 xx0Var, qx0 qx0Var, jx0 jx0Var, int i7, boolean z10) {
        return Math.max(0, this.a - jx0Var.a(qx0Var, i7));
    }

    @Override // org.telegram.ui.Components.ox0
    public final void b(int i7, int i10) {
        super.b(i7, i10);
        this.d = Math.max(this.d, i7 + i10);
    }

    @Override // org.telegram.ui.Components.ox0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.ox0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

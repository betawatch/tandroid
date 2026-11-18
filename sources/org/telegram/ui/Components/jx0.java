package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class jx0 extends nx0 {
    public int d;

    @Override // org.telegram.ui.Components.nx0
    public final int a(wx0 wx0Var, px0 px0Var, ix0 ix0Var, int i7, boolean z10) {
        return Math.max(0, this.a - ix0Var.a(px0Var, i7));
    }

    @Override // org.telegram.ui.Components.nx0
    public final void b(int i7, int i10) {
        super.b(i7, i10);
        this.d = Math.max(this.d, i7 + i10);
    }

    @Override // org.telegram.ui.Components.nx0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.nx0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

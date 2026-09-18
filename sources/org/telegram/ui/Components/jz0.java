package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class jz0 extends nz0 {
    public int d;

    @Override // org.telegram.ui.Components.nz0
    public final int a(wz0 wz0Var, pz0 pz0Var, iz0 iz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - iz0Var.a(pz0Var, i10));
    }

    @Override // org.telegram.ui.Components.nz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.nz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.nz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

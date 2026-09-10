package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

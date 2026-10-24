package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class vz0 extends zz0 {
    public int d;

    @Override // org.telegram.ui.Components.zz0
    public final int a(i01 i01Var, b01 b01Var, uz0 uz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - uz0Var.a(b01Var, i10));
    }

    @Override // org.telegram.ui.Components.zz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.zz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.zz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

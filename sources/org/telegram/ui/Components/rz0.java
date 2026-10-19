package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class rz0 extends vz0 {
    public int d;

    @Override // org.telegram.ui.Components.vz0
    public final int a(e01 e01Var, xz0 xz0Var, qz0 qz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - qz0Var.a(xz0Var, i10));
    }

    @Override // org.telegram.ui.Components.vz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.vz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.vz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

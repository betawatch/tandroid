package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xy0 extends bz0 {
    public int d;

    @Override // org.telegram.ui.Components.bz0
    public final int a(kz0 kz0Var, dz0 dz0Var, wy0 wy0Var, int i10, boolean z10) {
        return Math.max(0, this.a - wy0Var.a(dz0Var, i10));
    }

    @Override // org.telegram.ui.Components.bz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.bz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.bz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

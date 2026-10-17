package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class qz0 extends uz0 {
    public int d;

    @Override // org.telegram.ui.Components.uz0
    public final int a(d01 d01Var, wz0 wz0Var, pz0 pz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - pz0Var.a(wz0Var, i10));
    }

    @Override // org.telegram.ui.Components.uz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.uz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.uz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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

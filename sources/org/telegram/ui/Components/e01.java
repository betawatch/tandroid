package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e01 extends i01 {
    public int d;

    @Override // org.telegram.ui.Components.i01
    public final int a(r01 r01Var, k01 k01Var, kb1 kb1Var, int i10, boolean z10) {
        return Math.max(0, this.a - kb1Var.F(k01Var, i10));
    }

    @Override // org.telegram.ui.Components.i01
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.i01
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.i01
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

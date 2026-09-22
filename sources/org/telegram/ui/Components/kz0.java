package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class kz0 extends oz0 {
    public int d;

    @Override // org.telegram.ui.Components.oz0
    public final int a(xz0 xz0Var, qz0 qz0Var, jz0 jz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - jz0Var.a(qz0Var, i10));
    }

    @Override // org.telegram.ui.Components.oz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.oz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.oz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

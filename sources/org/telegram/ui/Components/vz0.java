package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

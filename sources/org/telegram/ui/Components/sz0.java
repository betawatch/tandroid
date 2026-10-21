package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class sz0 extends wz0 {
    public int d;

    @Override // org.telegram.ui.Components.wz0
    public final int a(f01 f01Var, yz0 yz0Var, rz0 rz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - rz0Var.a(yz0Var, i10));
    }

    @Override // org.telegram.ui.Components.wz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.wz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.wz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class py0 extends ty0 {
    public int d;

    @Override // org.telegram.ui.Components.ty0
    public final int a(cz0 cz0Var, vy0 vy0Var, oy0 oy0Var, int i10, boolean z10) {
        return Math.max(0, this.a - oy0Var.a(vy0Var, i10));
    }

    @Override // org.telegram.ui.Components.ty0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.ty0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.ty0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

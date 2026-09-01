package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bz0 extends fz0 {
    public int d;

    @Override // org.telegram.ui.Components.fz0
    public final int a(oz0 oz0Var, hz0 hz0Var, az0 az0Var, int i10, boolean z4) {
        return Math.max(0, this.a - az0Var.a(hz0Var, i10));
    }

    @Override // org.telegram.ui.Components.fz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.fz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.fz0
    public final int d(boolean z4) {
        return Math.max(super.d(z4), this.d);
    }
}

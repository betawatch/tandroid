package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class tz0 extends xz0 {
    public int d;

    @Override // org.telegram.ui.Components.xz0
    public final int a(g01 g01Var, zz0 zz0Var, sz0 sz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - sz0Var.a(zz0Var, i10));
    }

    @Override // org.telegram.ui.Components.xz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.xz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.xz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

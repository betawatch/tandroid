package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class dy0 extends hy0 {
    public int d;

    @Override // org.telegram.ui.Components.hy0
    public final int a(qy0 qy0Var, jy0 jy0Var, cy0 cy0Var, int i10, boolean z10) {
        return Math.max(0, this.a - cy0Var.a(jy0Var, i10));
    }

    @Override // org.telegram.ui.Components.hy0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.hy0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.hy0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

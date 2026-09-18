package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class yy0 extends cz0 {
    public int d;

    @Override // org.telegram.ui.Components.cz0
    public final int a(lz0 lz0Var, ez0 ez0Var, xy0 xy0Var, int i10, boolean z10) {
        return Math.max(0, this.a - xy0Var.a(ez0Var, i10));
    }

    @Override // org.telegram.ui.Components.cz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.cz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.cz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class az0 extends ez0 {
    public int d;

    @Override // org.telegram.ui.Components.ez0
    public final int a(nz0 nz0Var, gz0 gz0Var, zy0 zy0Var, int i10, boolean z4) {
        return Math.max(0, this.a - zy0Var.a(gz0Var, i10));
    }

    @Override // org.telegram.ui.Components.ez0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.ez0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.ez0
    public final int d(boolean z4) {
        return Math.max(super.d(z4), this.d);
    }
}

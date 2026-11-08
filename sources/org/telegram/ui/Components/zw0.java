package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class zw0 extends dx0 {
    public int d;

    @Override // org.telegram.ui.Components.dx0
    public final int a(mx0 mx0Var, fx0 fx0Var, yw0 yw0Var, int i7, boolean z9) {
        return Math.max(0, this.a - yw0Var.a(fx0Var, i7));
    }

    @Override // org.telegram.ui.Components.dx0
    public final void b(int i7, int i10) {
        super.b(i7, i10);
        this.d = Math.max(this.d, i7 + i10);
    }

    @Override // org.telegram.ui.Components.dx0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.dx0
    public final int d(boolean z9) {
        return Math.max(super.d(z9), this.d);
    }
}

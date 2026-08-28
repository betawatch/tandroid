package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ey0 extends iy0 {
    public int d;

    @Override // org.telegram.ui.Components.iy0
    public final int a(ry0 ry0Var, ky0 ky0Var, dy0 dy0Var, int i9, boolean z10) {
        return Math.max(0, this.a - dy0Var.a(ky0Var, i9));
    }

    @Override // org.telegram.ui.Components.iy0
    public final void b(int i9, int i10) {
        super.b(i9, i10);
        this.d = Math.max(this.d, i9 + i10);
    }

    @Override // org.telegram.ui.Components.iy0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.iy0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

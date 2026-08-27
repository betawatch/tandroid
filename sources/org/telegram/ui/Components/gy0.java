package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gy0 extends ky0 {
    public int d;

    @Override // org.telegram.ui.Components.ky0
    public final int a(ty0 ty0Var, my0 my0Var, fy0 fy0Var, int i10, boolean z10) {
        return Math.max(0, this.a - fy0Var.a(my0Var, i10));
    }

    @Override // org.telegram.ui.Components.ky0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.ky0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.ky0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

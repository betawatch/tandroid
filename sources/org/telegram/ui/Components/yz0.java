package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yz0 extends c01 {
    public int d;

    @Override // org.telegram.ui.Components.c01
    public final int a(l01 l01Var, e01 e01Var, xz0 xz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - xz0Var.a(e01Var, i10));
    }

    @Override // org.telegram.ui.Components.c01
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.c01
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.c01
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

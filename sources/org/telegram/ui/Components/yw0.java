package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class yw0 extends cx0 {
    public int d;

    @Override // org.telegram.ui.Components.cx0
    public final int a(lx0 lx0Var, ex0 ex0Var, xw0 xw0Var, int i7, boolean z9) {
        return Math.max(0, this.a - xw0Var.a(ex0Var, i7));
    }

    @Override // org.telegram.ui.Components.cx0
    public final void b(int i7, int i10) {
        super.b(i7, i10);
        this.d = Math.max(this.d, i7 + i10);
    }

    @Override // org.telegram.ui.Components.cx0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.cx0
    public final int d(boolean z9) {
        return Math.max(super.d(z9), this.d);
    }
}

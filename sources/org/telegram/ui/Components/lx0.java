package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class lx0 extends px0 {
    public int d;

    @Override // org.telegram.ui.Components.px0
    public final int a(yx0 yx0Var, rx0 rx0Var, kx0 kx0Var, int i7, boolean z10) {
        return Math.max(0, this.a - kx0Var.a(rx0Var, i7));
    }

    @Override // org.telegram.ui.Components.px0
    public final void b(int i7, int i10) {
        super.b(i7, i10);
        this.d = Math.max(this.d, i7 + i10);
    }

    @Override // org.telegram.ui.Components.px0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.px0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

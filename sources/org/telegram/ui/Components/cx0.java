package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class cx0 extends gx0 {
    public int d;

    @Override // org.telegram.ui.Components.gx0
    public final int a(px0 px0Var, ix0 ix0Var, bx0 bx0Var, int i7, boolean z10) {
        return Math.max(0, this.a - bx0Var.a(ix0Var, i7));
    }

    @Override // org.telegram.ui.Components.gx0
    public final void b(int i7, int i10) {
        super.b(i7, i10);
        this.d = Math.max(this.d, i7 + i10);
    }

    @Override // org.telegram.ui.Components.gx0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.gx0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

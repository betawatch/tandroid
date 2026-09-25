package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class hz0 extends lz0 {
    public int d;

    @Override // org.telegram.ui.Components.lz0
    public final int a(uz0 uz0Var, nz0 nz0Var, gz0 gz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - gz0Var.a(nz0Var, i10));
    }

    @Override // org.telegram.ui.Components.lz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.lz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.lz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d01 extends h01 {
    public int d;

    @Override // org.telegram.ui.Components.h01
    public final int a(q01 q01Var, j01 j01Var, gb1 gb1Var, int i10, boolean z10) {
        return Math.max(0, this.a - gb1Var.F(j01Var, i10));
    }

    @Override // org.telegram.ui.Components.h01
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.h01
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.h01
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class iz0 extends mz0 {
    public int d;

    @Override // org.telegram.ui.Components.mz0
    public final int a(vz0 vz0Var, oz0 oz0Var, hz0 hz0Var, int i10, boolean z10) {
        return Math.max(0, this.a - hz0Var.a(oz0Var, i10));
    }

    @Override // org.telegram.ui.Components.mz0
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
    }

    @Override // org.telegram.ui.Components.mz0
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.mz0
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}

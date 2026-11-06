package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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

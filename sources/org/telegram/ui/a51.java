package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a51 extends l41 {
    public eh D;
    public final int w;
    public final int x;
    public int y;

    public a51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.w = i7;
        this.x = i11;
    }

    @Override // org.telegram.ui.l41
    public final void b(o41 o41Var) {
        int i7;
        if (o41Var == null || (i7 = this.y) < 0) {
            return;
        }
        o41Var.a(this.w, this.x, i7, this.D);
    }

    @Override // org.telegram.ui.l41
    public final void c() {
    }

    @Override // org.telegram.ui.l41
    public final void f() {
    }
}

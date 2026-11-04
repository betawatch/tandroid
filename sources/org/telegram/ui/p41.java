package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p41 extends b41 {
    public ah E;
    public final int w;
    public final int x;
    public int y;

    public p41(Context context, int i3, int i10, mg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.w = i3;
        this.x = i11;
    }

    @Override // org.telegram.ui.b41
    public final void b(d41 d41Var) {
        int i3;
        if (d41Var == null || (i3 = this.y) < 0) {
            return;
        }
        d41Var.a(this.w, this.x, i3, this.E);
    }

    @Override // org.telegram.ui.b41
    public final void c() {
    }

    @Override // org.telegram.ui.b41
    public final void f() {
    }
}

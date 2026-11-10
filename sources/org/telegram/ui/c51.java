package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c51 extends n41 {
    public gh D;
    public final int w;
    public final int x;
    public int y;

    public c51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.w = i7;
        this.x = i11;
    }

    @Override // org.telegram.ui.n41
    public final void b(q41 q41Var) {
        int i7;
        if (q41Var == null || (i7 = this.y) < 0) {
            return;
        }
        q41Var.a(this.w, this.x, i7, this.D);
    }

    @Override // org.telegram.ui.n41
    public final void c() {
    }

    @Override // org.telegram.ui.n41
    public final void f() {
    }
}

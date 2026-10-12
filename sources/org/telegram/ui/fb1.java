package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class fb1 extends ra1 {
    public final int v;
    public final int w;
    public int x;
    public bi y;

    public fb1(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.ra1
    public final void b(ta1 ta1Var) {
        int i10;
        if (ta1Var == null || (i10 = this.x) < 0) {
            return;
        }
        ta1Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.ra1
    public final void c() {
    }

    @Override // org.telegram.ui.ra1
    public final void f() {
    }
}

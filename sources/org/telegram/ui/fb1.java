package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

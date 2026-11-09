package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b51 extends m41 {
    public gh D;
    public final int w;
    public final int x;
    public int y;

    public b51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.w = i7;
        this.x = i11;
    }

    @Override // org.telegram.ui.m41
    public final void b(p41 p41Var) {
        int i7;
        if (p41Var == null || (i7 = this.y) < 0) {
            return;
        }
        p41Var.a(this.w, this.x, i7, this.D);
    }

    @Override // org.telegram.ui.m41
    public final void c() {
    }

    @Override // org.telegram.ui.m41
    public final void f() {
    }
}

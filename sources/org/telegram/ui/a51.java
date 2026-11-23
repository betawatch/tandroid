package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a51 extends m41 {
    public fh E;
    public final int w;
    public final int x;
    public int y;

    public a51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.w = i7;
        this.x = i11;
    }

    @Override // org.telegram.ui.m41
    public final void b(o41 o41Var) {
        int i7;
        if (o41Var == null || (i7 = this.y) < 0) {
            return;
        }
        o41Var.a(this.w, this.x, i7, this.E);
    }

    @Override // org.telegram.ui.m41
    public final void c() {
    }

    @Override // org.telegram.ui.m41
    public final void f() {
    }
}

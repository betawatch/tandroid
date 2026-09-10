package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class db1 extends pa1 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.f61 y;

    public db1(Context context, int i10, int i11, hg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.pa1
    public final void b(ra1 ra1Var) {
        int i10;
        if (ra1Var == null || (i10 = this.x) < 0) {
            return;
        }
        ra1Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.pa1
    public final void c() {
    }

    @Override // org.telegram.ui.pa1
    public final void f() {
    }
}

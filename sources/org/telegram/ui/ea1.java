package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ea1 extends q91 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.s51 y;

    public ea1(Context context, int i10, int i11, vf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.q91
    public final void b(s91 s91Var) {
        int i10;
        if (s91Var == null || (i10 = this.x) < 0) {
            return;
        }
        s91Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.q91
    public final void c() {
    }

    @Override // org.telegram.ui.q91
    public final void f() {
    }
}

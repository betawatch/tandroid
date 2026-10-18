package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class p91 extends b91 {
    public final int v;
    public final int w;
    public int x;
    public qh y;

    public p91(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.b91
    public final void b(d91 d91Var) {
        int i10;
        if (d91Var == null || (i10 = this.x) < 0) {
            return;
        }
        d91Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.b91
    public final void c() {
    }

    @Override // org.telegram.ui.b91
    public final void f() {
    }
}

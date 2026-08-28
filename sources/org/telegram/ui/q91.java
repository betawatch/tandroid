package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q91 extends c91 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.v41 y;

    public q91(Context context, int i9, int i10, qf.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.v = i9;
        this.w = i11;
    }

    @Override // org.telegram.ui.c91
    public final void b(e91 e91Var) {
        int i9;
        if (e91Var == null || (i9 = this.x) < 0) {
            return;
        }
        e91Var.a(this.v, this.w, i9, this.y);
    }

    @Override // org.telegram.ui.c91
    public final void c() {
    }

    @Override // org.telegram.ui.c91
    public final void f() {
    }
}

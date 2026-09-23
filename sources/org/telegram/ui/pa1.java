package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class pa1 extends ba1 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.r51 y;

    public pa1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.ba1
    public final void b(da1 da1Var) {
        int i10;
        if (da1Var == null || (i10 = this.x) < 0) {
            return;
        }
        da1Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.ba1
    public final void c() {
    }

    @Override // org.telegram.ui.ba1
    public final void f() {
    }
}

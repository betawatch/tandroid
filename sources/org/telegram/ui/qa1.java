package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class qa1 extends ca1 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.f61 y;

    public qa1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.ca1
    public final void b(ea1 ea1Var) {
        int i10;
        if (ea1Var == null || (i10 = this.x) < 0) {
            return;
        }
        ea1Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.ca1
    public final void c() {
    }

    @Override // org.telegram.ui.ca1
    public final void f() {
    }
}

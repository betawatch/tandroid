package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class a51 extends l41 {
    public eh D;
    public final int w;
    public final int x;
    public int y;

    public a51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.w = i7;
        this.x = i11;
    }

    @Override // org.telegram.ui.l41
    public final void b(o41 o41Var) {
        int i7;
        if (o41Var == null || (i7 = this.y) < 0) {
            return;
        }
        o41Var.a(this.w, this.x, i7, this.D);
    }

    @Override // org.telegram.ui.l41
    public final void c() {
    }

    @Override // org.telegram.ui.l41
    public final void f() {
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q61 extends c61 {
    public uh D;
    public final int w;
    public final int x;
    public int y;

    public q61(Context context, int i10, int i11, bg.h hVar, int i12) {
        super(context, i11, hVar, null);
        this.w = i10;
        this.x = i12;
    }

    @Override // org.telegram.ui.c61
    public final void b(e61 e61Var) {
        int i10;
        if (e61Var == null || (i10 = this.y) < 0) {
            return;
        }
        e61Var.a(this.w, this.x, i10, this.D);
    }

    @Override // org.telegram.ui.c61
    public final void c() {
    }

    @Override // org.telegram.ui.c61
    public final void f() {
    }
}

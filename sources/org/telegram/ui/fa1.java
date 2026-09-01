package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fa1 extends r91 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.t51 y;

    public fa1(Context context, int i10, int i11, wf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.r91
    public final void b(t91 t91Var) {
        int i10;
        if (t91Var == null || (i10 = this.x) < 0) {
            return;
        }
        t91Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.r91
    public final void c() {
    }

    @Override // org.telegram.ui.r91
    public final void f() {
    }
}

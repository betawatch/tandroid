package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class la1 extends x91 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.s51 y;

    public la1(Context context, int i10, int i11, wf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.x91
    public final void b(z91 z91Var) {
        int i10;
        if (z91Var == null || (i10 = this.x) < 0) {
            return;
        }
        z91Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.x91
    public final void c() {
    }

    @Override // org.telegram.ui.x91
    public final void f() {
    }
}

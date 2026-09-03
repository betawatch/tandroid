package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ma1 extends y91 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.s51 y;

    public ma1(Context context, int i10, int i11, vf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.y91
    public final void b(aa1 aa1Var) {
        int i10;
        if (aa1Var == null || (i10 = this.x) < 0) {
            return;
        }
        aa1Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.y91
    public final void c() {
    }

    @Override // org.telegram.ui.y91
    public final void f() {
    }
}

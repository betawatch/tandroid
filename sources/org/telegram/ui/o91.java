package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o91 extends a91 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.x41 y;

    public o91(Context context, int i10, int i11, rf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.a91
    public final void b(c91 c91Var) {
        int i10;
        if (c91Var == null || (i10 = this.x) < 0) {
            return;
        }
        c91Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.a91
    public final void c() {
    }

    @Override // org.telegram.ui.a91
    public final void f() {
    }
}

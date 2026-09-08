package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class uv extends x9 {
    public final /* synthetic */ xv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(xv xvVar, Context context) {
        super(context);
        this.G = xvVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ah.y0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.y0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}

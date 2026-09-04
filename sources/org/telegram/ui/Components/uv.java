package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

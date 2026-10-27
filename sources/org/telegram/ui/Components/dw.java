package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dw extends y9 {
    public final /* synthetic */ gw G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(gw gwVar, Context context) {
        super(context);
        this.G = gwVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (bh.m0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (bh.m0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}

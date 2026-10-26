package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

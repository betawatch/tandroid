package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mr0 extends ClippingImageView {
    public final /* synthetic */ zk0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(Context context, ys0 ys0Var) {
        super(context);
        this.N = ys0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.N.invalidate();
    }
}

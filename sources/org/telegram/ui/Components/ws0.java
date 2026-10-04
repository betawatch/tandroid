package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ws0 extends ClippingImageView {
    public final /* synthetic */ zl0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(Context context, hu0 hu0Var) {
        super(context);
        this.R = hu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

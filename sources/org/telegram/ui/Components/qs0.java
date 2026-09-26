package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class qs0 extends ClippingImageView {
    public final /* synthetic */ wl0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(Context context, bu0 bu0Var) {
        super(context);
        this.R = bu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

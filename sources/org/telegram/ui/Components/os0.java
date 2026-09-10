package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class os0 extends ClippingImageView {
    public final /* synthetic */ vl0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(Context context, zt0 zt0Var) {
        super(context);
        this.R = zt0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

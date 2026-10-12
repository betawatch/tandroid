package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class et0 extends ClippingImageView {
    public final /* synthetic */ mm0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(Context context, pu0 pu0Var) {
        super(context);
        this.R = pu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

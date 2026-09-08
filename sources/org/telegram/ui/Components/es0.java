package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class es0 extends ClippingImageView {
    public final /* synthetic */ ll0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(Context context, pt0 pt0Var) {
        super(context);
        this.R = pt0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

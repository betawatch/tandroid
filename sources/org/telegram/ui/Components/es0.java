package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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

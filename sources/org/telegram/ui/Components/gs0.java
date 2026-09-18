package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gs0 extends ClippingImageView {
    public final /* synthetic */ ml0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(Context context, rt0 rt0Var) {
        super(context);
        this.R = rt0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

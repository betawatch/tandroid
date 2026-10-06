package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class xs0 extends ClippingImageView {
    public final /* synthetic */ zl0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(Context context, iu0 iu0Var) {
        super(context);
        this.R = iu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

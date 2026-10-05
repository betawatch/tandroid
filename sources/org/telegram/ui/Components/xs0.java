package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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

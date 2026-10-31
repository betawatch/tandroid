package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lr0 extends ClippingImageView {
    public final /* synthetic */ tk0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr0(Context context, rs0 rs0Var) {
        super(context);
        this.R = rs0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

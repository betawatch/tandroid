package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class rs0 extends ClippingImageView {
    public final /* synthetic */ wl0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(Context context, cu0 cu0Var) {
        super(context);
        this.R = cu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

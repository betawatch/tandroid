package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class bt0 extends ClippingImageView {
    public final /* synthetic */ jm0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(Context context, mu0 mu0Var) {
        super(context);
        this.R = mu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

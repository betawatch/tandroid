package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

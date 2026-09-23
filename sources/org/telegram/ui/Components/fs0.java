package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fs0 extends ClippingImageView {
    public final /* synthetic */ ml0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(Context context, qt0 qt0Var) {
        super(context);
        this.R = qt0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

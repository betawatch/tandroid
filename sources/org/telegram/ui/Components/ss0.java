package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ss0 extends ClippingImageView {
    public final /* synthetic */ yl0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(Context context, du0 du0Var) {
        super(context);
        this.R = du0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

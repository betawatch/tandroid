package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lq0 extends ClippingImageView {
    public final /* synthetic */ pj0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(Context context, sr0 sr0Var) {
        super(context);
        this.R = sr0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

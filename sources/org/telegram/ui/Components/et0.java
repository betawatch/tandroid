package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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

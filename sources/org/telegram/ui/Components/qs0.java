package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class qs0 extends ClippingImageView {
    public final /* synthetic */ wl0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(Context context, bu0 bu0Var) {
        super(context);
        this.R = bu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class xs0 extends ClippingImageView {
    public final /* synthetic */ zl0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(Context context, iu0 iu0Var) {
        super(context);
        this.R = iu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

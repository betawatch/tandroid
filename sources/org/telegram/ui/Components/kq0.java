package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class kq0 extends ClippingImageView {
    public final /* synthetic */ pj0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(Context context, rr0 rr0Var) {
        super(context);
        this.R = rr0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class rs0 extends ClippingImageView {
    public final /* synthetic */ wl0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(Context context, cu0 cu0Var) {
        super(context);
        this.R = cu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

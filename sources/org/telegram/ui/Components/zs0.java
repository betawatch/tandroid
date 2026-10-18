package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zs0 extends ClippingImageView {
    public final /* synthetic */ im0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs0(Context context, ku0 ku0Var) {
        super(context);
        this.R = ku0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

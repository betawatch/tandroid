package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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

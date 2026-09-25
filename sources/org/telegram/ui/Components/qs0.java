package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

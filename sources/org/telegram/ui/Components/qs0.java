package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class qs0 extends ClippingImageView {
    public final /* synthetic */ vl0 R;

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

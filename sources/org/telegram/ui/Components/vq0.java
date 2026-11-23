package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vq0 extends ClippingImageView {
    public final /* synthetic */ ek0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(Context context, cs0 cs0Var) {
        super(context);
        this.S = cs0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}

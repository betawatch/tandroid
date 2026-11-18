package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class uq0 extends ClippingImageView {
    public final /* synthetic */ ck0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(Context context, as0 as0Var) {
        super(context);
        this.S = as0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}

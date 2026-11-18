package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

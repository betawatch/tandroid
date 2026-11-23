package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class wq0 extends ClippingImageView {
    public final /* synthetic */ ek0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq0(Context context, cs0 cs0Var) {
        super(context);
        this.S = cs0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}

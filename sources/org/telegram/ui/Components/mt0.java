package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mt0 extends ClippingImageView {
    public final /* synthetic */ nm0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt0(Context context, tu0 tu0Var) {
        super(context);
        this.R = tu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

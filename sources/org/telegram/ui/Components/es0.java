package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class es0 extends ClippingImageView {
    public final /* synthetic */ sl0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(Context context, pt0 pt0Var) {
        super(context);
        this.O = pt0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.O.invalidate();
    }
}

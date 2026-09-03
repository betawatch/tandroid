package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

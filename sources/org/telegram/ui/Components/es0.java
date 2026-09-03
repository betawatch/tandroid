package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class es0 extends ClippingImageView {
    public final /* synthetic */ rl0 O;

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

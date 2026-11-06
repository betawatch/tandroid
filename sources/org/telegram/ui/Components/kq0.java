package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class kq0 extends ClippingImageView {
    public final /* synthetic */ pj0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(Context context, rr0 rr0Var) {
        super(context);
        this.R = rr0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

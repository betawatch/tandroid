package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

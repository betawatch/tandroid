package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class it0 extends ClippingImageView {
    public final /* synthetic */ qm0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it0(Context context, tu0 tu0Var) {
        super(context);
        this.R = tu0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

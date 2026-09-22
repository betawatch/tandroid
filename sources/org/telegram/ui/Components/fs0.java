package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fs0 extends ClippingImageView {
    public final /* synthetic */ ll0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(Context context, qt0 qt0Var) {
        super(context);
        this.R = qt0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

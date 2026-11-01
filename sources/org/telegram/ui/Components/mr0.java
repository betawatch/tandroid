package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mr0 extends ClippingImageView {
    public final /* synthetic */ uk0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(Context context, ss0 ss0Var) {
        super(context);
        this.R = ss0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}

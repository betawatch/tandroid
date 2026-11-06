package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

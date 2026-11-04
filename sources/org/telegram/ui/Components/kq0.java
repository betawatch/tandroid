package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kq0 extends ClippingImageView {
    public final /* synthetic */ tj0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(Context context, qr0 qr0Var) {
        super(context);
        this.S = qr0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}

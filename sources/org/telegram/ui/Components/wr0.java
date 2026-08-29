package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wr0 extends ClippingImageView {
    public final /* synthetic */ jl0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr0(Context context, ht0 ht0Var) {
        super(context);
        this.N = ht0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.N.invalidate();
    }
}

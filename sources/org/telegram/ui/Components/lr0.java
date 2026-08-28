package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lr0 extends ClippingImageView {
    public final /* synthetic */ wk0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr0(Context context, ws0 ws0Var) {
        super(context);
        this.N = ws0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.N.invalidate();
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class wq0 extends ClippingImageView {
    public final /* synthetic */ ek0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq0(Context context, cs0 cs0Var) {
        super(context);
        this.S = cs0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}

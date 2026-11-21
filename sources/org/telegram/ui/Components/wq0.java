package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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

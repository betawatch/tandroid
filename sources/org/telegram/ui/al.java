package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class al extends hi.l3 {
    public final /* synthetic */ bn X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(bn bnVar, Activity activity) {
        super(activity, 3);
        this.X0 = bnVar;
    }

    @Override // hi.l3, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        setTranslationY(((-getTop()) - org.telegram.messenger.g0.L(120.0f)) + this.X0.R1);
    }
}

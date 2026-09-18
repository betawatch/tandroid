package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i6 extends org.telegram.ui.Components.wf0 {
    public final /* synthetic */ a7 F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(a7 a7Var, Context context) {
        super(context);
        this.F0 = a7Var;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F0.k0);
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.F0.k0);
        super.onDetachedFromWindow();
    }
}

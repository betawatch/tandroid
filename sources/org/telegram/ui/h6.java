package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class h6 extends org.telegram.ui.Components.hg0 {
    public final /* synthetic */ z6 F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(z6 z6Var, Context context) {
        super(context);
        this.F0 = z6Var;
    }

    @Override // org.telegram.ui.Components.cw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F0.k0);
    }

    @Override // org.telegram.ui.Components.cw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.F0.k0);
        super.onDetachedFromWindow();
    }
}

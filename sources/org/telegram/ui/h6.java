package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class h6 extends org.telegram.ui.Components.eg0 {
    public final /* synthetic */ z6 F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(z6 z6Var, Context context) {
        super(context);
        this.F0 = z6Var;
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F0.k0);
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.F0.k0);
        super.onDetachedFromWindow();
    }
}

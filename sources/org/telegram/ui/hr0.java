package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.nb nbVar;
        Drawable[] drawableArr = PhotoViewer.Q8;
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
        if (icVar == null || (nbVar = icVar.e) == null) {
            return;
        }
        nbVar.updatePosition();
    }
}

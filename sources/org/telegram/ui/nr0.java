package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr0 implements ValueAnimator.AnimatorUpdateListener {
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

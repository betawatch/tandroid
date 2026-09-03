package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or0 implements ValueAnimator.AnimatorUpdateListener {
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

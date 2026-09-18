package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class es0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.sb sbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.w;
        if (ocVar == null || (sbVar = ocVar.e) == null) {
            return;
        }
        sbVar.updatePosition();
    }
}

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.bb bbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
        if (wbVar == null || (bbVar = wbVar.e) == null) {
            return;
        }
        bbVar.updatePosition();
    }
}

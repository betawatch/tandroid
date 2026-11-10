package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.fb fbVar;
        Drawable[] drawableArr = PhotoViewer.Y8;
        org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.w;
        if (bcVar == null || (fbVar = bcVar.e) == null) {
            return;
        }
        fbVar.updatePosition();
    }
}

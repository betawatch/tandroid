package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.tb tbVar;
        Drawable[] drawableArr = PhotoViewer.T8;
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
        if (pcVar == null || (tbVar = pcVar.e) == null) {
            return;
        }
        tbVar.updatePosition();
    }
}

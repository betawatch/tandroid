package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.tb tbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
        if (pcVar == null || (tbVar = pcVar.e) == null) {
            return;
        }
        tbVar.updatePosition();
    }
}

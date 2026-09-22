package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs0 implements ValueAnimator.AnimatorUpdateListener {
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

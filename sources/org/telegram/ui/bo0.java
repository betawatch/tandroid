package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.lb lbVar;
        Drawable[] drawableArr = PhotoViewer.Z8;
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
        if (gcVar == null || (lbVar = gcVar.e) == null) {
            return;
        }
        lbVar.updatePosition();
    }
}

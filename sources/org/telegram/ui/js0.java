package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class js0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.wb wbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.w;
        if (scVar == null || (wbVar = scVar.e) == null) {
            return;
        }
        wbVar.updatePosition();
    }
}

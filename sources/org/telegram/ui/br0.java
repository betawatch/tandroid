package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class br0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.jb jbVar;
        Drawable[] drawableArr = PhotoViewer.P8;
        org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.w;
        if (ecVar == null || (jbVar = ecVar.e) == null) {
            return;
        }
        jbVar.updatePosition();
    }
}

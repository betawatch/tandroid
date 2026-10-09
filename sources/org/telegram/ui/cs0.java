package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.xb xbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.w;
        if (tcVar == null || (xbVar = tcVar.e) == null) {
            return;
        }
        xbVar.updatePosition();
    }
}

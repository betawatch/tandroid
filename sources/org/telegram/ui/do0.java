package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class do0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.kb kbVar;
        Drawable[] drawableArr = PhotoViewer.f9;
        org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.w;
        if (fcVar == null || (kbVar = fcVar.e) == null) {
            return;
        }
        kbVar.updatePosition();
    }
}

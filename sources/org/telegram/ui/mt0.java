package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ hu0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public mt0(PhotoViewer photoViewer, hu0 hu0Var, Integer num) {
        this.c = photoViewer;
        this.a = hu0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.d0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.C.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.C.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
        duration.setInterpolator(nrVar).start();
        photoViewer.K0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.K0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.L0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.L0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.M0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.M0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.setAlpha(0.0f);
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.p3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.p3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar).start();
        photoViewer.b0.setAlpha(0.0f);
        photoViewer.I0.setAlpha(0);
        photoViewer.k4 = 4;
        photoViewer.b0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        dg.s1 s1Var = photoViewer.M0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(s1Var, (Property<dg.s1, Float>) View.TRANSLATION_Y, s1Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(nrVar);
        dg.s1 s1Var2 = photoViewer.M0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(s1Var2, (Property<dg.s1, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(nrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.b0, (Property<bu0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.g0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new lt0(this));
        animatorSet.start();
        return true;
    }
}

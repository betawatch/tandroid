package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kr0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ds0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public kr0(PhotoViewer photoViewer, ds0 ds0Var, Integer num) {
        this.c = photoViewer;
        this.a = ds0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-org.telegram.messenger.i0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        duration.setInterpolator(grVar).start();
        photoViewer.N0.setTranslationY(-org.telegram.messenger.i0.L(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.i0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.P0.setTranslationY(org.telegram.messenger.i0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.S0.setTranslationY(org.telegram.messenger.i0.L(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.s3.setTranslationY(org.telegram.messenger.i0.L(32.0f));
        photoViewer.s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
        photoViewer.e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.n4 = 4;
        photoViewer.e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        jg.b1 b1Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(b1Var, (Property<jg.b1, Float>) View.TRANSLATION_Y, b1Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(grVar);
        jg.b1 b1Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(b1Var2, (Property<jg.b1, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(grVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.e0, (Property<zr0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new jr0(this));
        animatorSet.start();
        return true;
    }
}

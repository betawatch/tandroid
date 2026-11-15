package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class aq0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ sq0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public aq0(PhotoViewer photoViewer, sq0 sq0Var, Integer num) {
        this.c = photoViewer;
        this.a = sq0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.h0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.G.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f;
        duration.setInterpolator(erVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.P0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.Q0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.Q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.T0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.T0.setAlpha(0.0f);
        photoViewer.T0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.s3.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.f0.setAlpha(0.0f);
        photoViewer.M0.setAlpha(0);
        photoViewer.n4 = 4;
        photoViewer.f0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        di.k4 k4Var = photoViewer.Q0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(k4Var, (Property<di.k4, Float>) View.TRANSLATION_Y, k4Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(erVar);
        di.k4 k4Var2 = photoViewer.Q0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(k4Var2, (Property<di.k4, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(erVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f0, (Property<oq0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new zp0(this));
        animatorSet.start();
        return true;
    }
}

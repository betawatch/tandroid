package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cq0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ uq0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public cq0(PhotoViewer photoViewer, uq0 uq0Var, Integer num) {
        this.c = photoViewer;
        this.a = uq0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.h0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.G.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.f;
        duration.setInterpolator(lrVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(lrVar).start();
        photoViewer.P0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(lrVar).start();
        photoViewer.Q0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.Q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(lrVar).start();
        photoViewer.T0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.T0.setAlpha(0.0f);
        photoViewer.T0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(lrVar).start();
        photoViewer.s3.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(lrVar).start();
        photoViewer.f0.setAlpha(0.0f);
        photoViewer.M0.setAlpha(0);
        photoViewer.n4 = 4;
        photoViewer.f0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        di.n4 n4Var = photoViewer.Q0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(n4Var, (Property<di.n4, Float>) View.TRANSLATION_Y, n4Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(lrVar);
        di.n4 n4Var2 = photoViewer.Q0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(n4Var2, (Property<di.n4, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(lrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f0, (Property<qq0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new bq0(this));
        animatorSet.start();
        return true;
    }
}

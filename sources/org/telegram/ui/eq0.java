package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class eq0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ xq0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public eq0(PhotoViewer photoViewer, xq0 xq0Var, Integer num) {
        this.c = photoViewer;
        this.a = xq0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
        duration.setInterpolator(wqVar).start();
        photoViewer.N0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        photoViewer.P0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wqVar).start();
        photoViewer.S0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        photoViewer.r3.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.r3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        photoViewer.e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.m4 = 4;
        photoViewer.e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        bi.m5 m5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(m5Var, (Property<bi.m5, Float>) View.TRANSLATION_Y, m5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(wqVar);
        bi.m5 m5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(m5Var2, (Property<bi.m5, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(wqVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.e0, (Property<sq0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new dq0(this));
        animatorSet.start();
        return true;
    }
}

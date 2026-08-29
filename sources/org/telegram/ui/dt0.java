package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ xt0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public dt0(PhotoViewer photoViewer, xt0 xt0Var, Integer num) {
        this.c = photoViewer;
        this.a = xt0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.c0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.B.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.B.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
        duration.setInterpolator(jrVar).start();
        photoViewer.J0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.J0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        photoViewer.K0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.K0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        photoViewer.L0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.L0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
        photoViewer.O0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.O0.setAlpha(0.0f);
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        photoViewer.o3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.o3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        photoViewer.a0.setAlpha(0.0f);
        photoViewer.H0.setAlpha(0);
        photoViewer.j4 = 4;
        photoViewer.a0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        bg.u1 u1Var = photoViewer.L0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(u1Var, (Property<bg.u1, Float>) View.TRANSLATION_Y, u1Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(jrVar);
        bg.u1 u1Var2 = photoViewer.L0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(u1Var2, (Property<bg.u1, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(jrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.a0, (Property<rt0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new ct0(this));
        animatorSet.start();
        return true;
    }
}

package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class cl implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    public final float[] b = {0.0f, 1.0f};
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ dl d;

    public cl(dl dlVar, FrameLayout frameLayout) {
        this.d = dlVar;
        this.c = frameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float lerp = AndroidUtilities.lerp(this.b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.a) {
            dl dlVar = this.d;
            gl glVar = dlVar.b;
            gl glVar2 = dlVar.b;
            if (glVar.i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(glVar2.i0, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(glVar2.i0, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(glVar2.i0, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.a = true;
            }
        }
        float interpolation = lerp <= 0.5f ? pr.g.getInterpolation(lerp / 0.5f) * 1.1f : lerp <= 0.75f ? 1.1f - (pr.g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f) : (pr.g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        FrameLayout frameLayout = this.c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}

package org.telegram.ui;

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
public final class ed0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    public final float[] b = {0.0f, 1.0f};
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ fd0 d;

    public ed0(fd0 fd0Var, FrameLayout frameLayout) {
        this.d = fd0Var;
        this.c = frameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float lerp = AndroidUtilities.lerp(this.b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.a) {
            fd0 fd0Var = this.d;
            id0 id0Var = fd0Var.b;
            id0 id0Var2 = fd0Var.b;
            if (id0Var.o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(id0Var2.o0, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(id0Var2.o0, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(id0Var2.o0, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.a = true;
            }
        }
        float interpolation = lerp <= 0.5f ? org.telegram.ui.Components.pr.g.getInterpolation(lerp / 0.5f) * 1.1f : lerp <= 0.75f ? 1.1f - (org.telegram.ui.Components.pr.g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f) : (org.telegram.ui.Components.pr.g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        FrameLayout frameLayout = this.c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}

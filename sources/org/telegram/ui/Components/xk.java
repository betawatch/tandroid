package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xk implements ValueAnimator.AnimatorUpdateListener {
    public boolean b;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ FrameLayout e;
    public final /* synthetic */ int a = 0;
    public final float[] c = {0.0f, 1.0f};

    public xk(yk ykVar, FrameLayout frameLayout) {
        this.e = ykVar;
        this.d = frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        int i10 = this.a;
        float[] fArr = this.c;
        FrameLayout frameLayout = this.e;
        FrameLayout frameLayout2 = this.d;
        switch (i10) {
            case 0:
                yk ykVar = (yk) frameLayout;
                float T1 = org.telegram.messenger.i0.T1(fArr[0], fArr[1], valueAnimator.getAnimatedFraction());
                if (T1 >= 0.7f && !this.b) {
                    bl blVar = ykVar.b;
                    bl blVar2 = ykVar.b;
                    if (blVar.g0 != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(blVar2.g0, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(blVar2.g0, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(blVar2.g0, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        this.b = true;
                    }
                }
                float interpolation = T1 <= 0.5f ? gr.g.getInterpolation(T1 / 0.5f) * 1.1f : T1 <= 0.75f ? 1.1f - (gr.g.getInterpolation((T1 - 0.5f) / 0.25f) * 0.2f) : (gr.g.getInterpolation((T1 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
                frameLayout2.setScaleX(interpolation);
                frameLayout2.setScaleY(interpolation);
                break;
            default:
                org.telegram.ui.ub0 ub0Var = (org.telegram.ui.ub0) frameLayout;
                float T12 = org.telegram.messenger.i0.T1(fArr[0], fArr[1], valueAnimator.getAnimatedFraction());
                if (T12 >= 0.7f && !this.b) {
                    org.telegram.ui.yb0 yb0Var = ub0Var.b;
                    org.telegram.ui.yb0 yb0Var2 = ub0Var.b;
                    if (yb0Var.x0 != null) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        f7 = 0.5f;
                        f10 = 1.1f;
                        f11 = 0.75f;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(yb0Var2.x0, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(yb0Var2.x0, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(yb0Var2.x0, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                        animatorSet2.setInterpolator(new OvershootInterpolator(1.02f));
                        animatorSet2.setDuration(250L);
                        animatorSet2.start();
                        this.b = true;
                        float interpolation2 = T12 > f7 ? gr.g.getInterpolation(T12 / f7) * f10 : T12 <= f11 ? f10 - (gr.g.getInterpolation((T12 - f7) / 0.25f) * 0.2f) : (gr.g.getInterpolation((T12 - f11) / 0.25f) * 0.1f) + 0.9f;
                        frameLayout2.setScaleX(interpolation2);
                        frameLayout2.setScaleY(interpolation2);
                        break;
                    }
                }
                f7 = 0.5f;
                f10 = 1.1f;
                f11 = 0.75f;
                if (T12 > f7) {
                }
                frameLayout2.setScaleX(interpolation2);
                frameLayout2.setScaleY(interpolation2);
                break;
        }
    }

    public xk(org.telegram.ui.ub0 ub0Var, FrameLayout frameLayout) {
        this.e = ub0Var;
        this.d = frameLayout;
    }
}

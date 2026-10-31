package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ lv0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                profileActivity.x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                break;
            case 1:
                RectF rectF = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.W4(valueAnimator.getAnimatedFraction());
                break;
            case 2:
                RectF rectF2 = ProfileActivity.R6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.K5(true);
                break;
            default:
                RectF rectF3 = ProfileActivity.R6;
                profileActivity.K5(true);
                break;
        }
    }
}

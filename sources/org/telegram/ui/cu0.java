package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cu0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ cu0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                profileActivity.x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                break;
            case 1:
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.X4(valueAnimator.getAnimatedFraction());
                break;
            case 2:
                RectF rectF2 = ProfileActivity.S6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.L5(true);
                break;
            default:
                RectF rectF3 = ProfileActivity.S6;
                profileActivity.L5(true);
                break;
        }
    }
}

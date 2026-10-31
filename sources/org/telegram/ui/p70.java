package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ p70(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                launchActivity.w0.invalidate();
                break;
            default:
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}

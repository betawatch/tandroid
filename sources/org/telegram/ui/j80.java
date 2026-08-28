package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ j80(LaunchActivity launchActivity, int i9) {
        this.a = i9;
        this.b = launchActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i9) {
            case 0:
                launchActivity.s0.invalidate();
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}

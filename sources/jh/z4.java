package jh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d5 b;

    public /* synthetic */ z4(d5 d5Var, int i10) {
        this.a = i10;
        this.b = d5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d5 d5Var = this.b;
                d5Var.getClass();
                d5Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var.d(d5Var.Q);
                break;
            case 1:
                d5 d5Var2 = this.b;
                d5Var2.getClass();
                float x4 = com.google.android.recaptcha.internal.a.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                d5Var2.p0 = x4;
                FrameLayout frameLayout = d5Var2.b;
                frameLayout.setScaleX(x4);
                frameLayout.setScaleY(d5Var2.p0);
                d5Var2.invalidate();
                break;
            default:
                d5 d5Var3 = this.b;
                d5Var3.getClass();
                d5Var3.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var3.d(d5Var3.Q);
                break;
        }
    }
}

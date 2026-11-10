package bi;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;

    public /* synthetic */ a7(e7 e7Var, int i7) {
        this.a = i7;
        this.b = e7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e7 e7Var = this.b;
                e7Var.getClass();
                e7Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.d(e7Var.a0);
                break;
            case 1:
                e7 e7Var2 = this.b;
                e7Var2.getClass();
                float x10 = com.google.android.recaptcha.internal.a.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                e7Var2.w0 = x10;
                FrameLayout frameLayout = e7Var2.b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(e7Var2.w0);
                e7Var2.invalidate();
                break;
            default:
                e7 e7Var3 = this.b;
                e7Var3.getClass();
                e7Var3.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var3.d(e7Var3.a0);
                break;
        }
    }
}

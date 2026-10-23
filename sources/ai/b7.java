package ai;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7 b;

    public /* synthetic */ b7(f7 f7Var, int i10) {
        this.a = i10;
        this.b = f7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f7 f7Var = this.b;
                f7Var.getClass();
                f7Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f7Var.d(f7Var.a0);
                break;
            case 1:
                f7 f7Var2 = this.b;
                f7Var2.getClass();
                float t10 = com.google.android.gms.internal.play_billing.k3.t((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                f7Var2.w0 = t10;
                FrameLayout frameLayout = f7Var2.b;
                frameLayout.setScaleX(t10);
                frameLayout.setScaleY(f7Var2.w0);
                f7Var2.invalidate();
                break;
            default:
                f7 f7Var3 = this.b;
                f7Var3.getClass();
                f7Var3.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f7Var3.d(f7Var3.a0);
                break;
        }
    }
}

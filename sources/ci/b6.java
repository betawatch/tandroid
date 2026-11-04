package ci;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ b6(f6 f6Var, int i3) {
        this.a = i3;
        this.b = f6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                f6Var.getClass();
                f6Var.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.d(f6Var.b0);
                break;
            case 1:
                f6 f6Var2 = this.b;
                f6Var2.getClass();
                float v = com.google.android.recaptcha.internal.a.v((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                f6Var2.x0 = v;
                FrameLayout frameLayout = f6Var2.b;
                frameLayout.setScaleX(v);
                frameLayout.setScaleY(f6Var2.x0);
                f6Var2.invalidate();
                break;
            default:
                f6 f6Var3 = this.b;
                f6Var3.getClass();
                f6Var3.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var3.d(f6Var3.b0);
                break;
        }
    }
}

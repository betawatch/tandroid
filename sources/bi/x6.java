package bi;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7 b;

    public /* synthetic */ x6(b7 b7Var, int i10) {
        this.a = i10;
        this.b = b7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b7 b7Var = this.b;
                b7Var.getClass();
                b7Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b7Var.d(b7Var.a0);
                break;
            case 1:
                b7 b7Var2 = this.b;
                b7Var2.getClass();
                float u10 = c3.h0.u((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                b7Var2.w0 = u10;
                FrameLayout frameLayout = b7Var2.b;
                frameLayout.setScaleX(u10);
                frameLayout.setScaleY(b7Var2.w0);
                b7Var2.invalidate();
                break;
            default:
                b7 b7Var3 = this.b;
                b7Var3.getClass();
                b7Var3.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b7Var3.d(b7Var3.a0);
                break;
        }
    }
}

package hh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5 b;

    public /* synthetic */ a5(e5 e5Var, int i10) {
        this.a = i10;
        this.b = e5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e5 e5Var = this.b;
                e5Var.getClass();
                e5Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e5Var.d(e5Var.Q);
                break;
            case 1:
                e5 e5Var2 = this.b;
                e5Var2.getClass();
                float x8 = com.google.android.recaptcha.internal.a.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                e5Var2.p0 = x8;
                FrameLayout frameLayout = e5Var2.b;
                frameLayout.setScaleX(x8);
                frameLayout.setScaleY(e5Var2.p0);
                e5Var2.invalidate();
                break;
            default:
                e5 e5Var3 = this.b;
                e5Var3.getClass();
                e5Var3.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e5Var3.d(e5Var3.Q);
                break;
        }
    }
}

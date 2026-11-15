package di;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ s5(w5 w5Var, int i7) {
        this.a = i7;
        this.b = w5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w5 w5Var = this.b;
                w5Var.getClass();
                w5Var.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.d(w5Var.b0);
                break;
            case 1:
                w5 w5Var2 = this.b;
                w5Var2.getClass();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                w5Var2.x0 = x10;
                FrameLayout frameLayout = w5Var2.b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(w5Var2.x0);
                w5Var2.invalidate();
                break;
            default:
                w5 w5Var3 = this.b;
                w5Var3.getClass();
                w5Var3.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var3.d(w5Var3.b0);
                break;
        }
    }
}

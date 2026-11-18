package di;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ v5(z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z5 z5Var = this.b;
                z5Var.getClass();
                z5Var.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var.d(z5Var.b0);
                break;
            case 1:
                z5 z5Var2 = this.b;
                z5Var2.getClass();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                z5Var2.A0 = x10;
                FrameLayout frameLayout = z5Var2.b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(z5Var2.A0);
                z5Var2.invalidate();
                break;
            default:
                z5 z5Var3 = this.b;
                z5Var3.getClass();
                z5Var3.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var3.d(z5Var3.b0);
                break;
        }
    }
}

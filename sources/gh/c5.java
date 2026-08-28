package gh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ c5(g5 g5Var, int i9) {
        this.a = i9;
        this.b = g5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g5 g5Var = this.b;
                g5Var.getClass();
                g5Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g5Var.d(g5Var.Q);
                break;
            case 1:
                g5 g5Var2 = this.b;
                g5Var2.getClass();
                float x10 = e2.c.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                g5Var2.p0 = x10;
                FrameLayout frameLayout = g5Var2.b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(g5Var2.p0);
                g5Var2.invalidate();
                break;
            default:
                g5 g5Var3 = this.b;
                g5Var3.getClass();
                g5Var3.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g5Var3.d(g5Var3.Q);
                break;
        }
    }
}

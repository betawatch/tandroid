package di;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ r1(t1 t1Var, int i10) {
        this.a = i10;
        this.b = t1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                t1 t1Var = this.b;
                t1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.n = floatValue;
                View view = t1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - t1Var.n);
                view.setScaleY(1.0f - t1Var.n);
                t1Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.f(t1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                t1Var.a.invalidate();
                break;
        }
    }
}

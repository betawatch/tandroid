package di;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ d2(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q4 q4Var = this.b;
                q4Var.getClass();
                q4Var.w2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var.invalidate();
                break;
            case 1:
                q4 q4Var2 = this.b;
                q4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var2.i3 = floatValue;
                q4Var2.g3.setTransitionProgress(floatValue);
                break;
            default:
                q4.X(this.b, valueAnimator);
                break;
        }
    }
}

package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ u1(b4 b4Var, int i7) {
        this.a = i7;
        this.b = b4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                b4Var.getClass();
                b4Var.r2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                break;
            case 1:
                b4 b4Var2 = this.b;
                b4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var2.d3 = floatValue;
                b4Var2.b3.setTransitionProgress(floatValue);
                break;
            default:
                b4.X(this.b, valueAnimator);
                break;
        }
    }
}

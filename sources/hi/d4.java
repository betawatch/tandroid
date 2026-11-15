package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ d4(m5 m5Var, int i7) {
        this.a = i7;
        this.b = m5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m5 m5Var = this.b;
                m5Var.getClass();
                m5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                m5 m5Var2 = this.b;
                m5Var2.getClass();
                m5Var2.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                m5 m5Var3 = this.b;
                m5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var3.L1 = floatValue;
                m5Var3.J1.setTransitionProgress(floatValue);
                break;
        }
    }
}

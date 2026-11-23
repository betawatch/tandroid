package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ n4(v5 v5Var, int i7) {
        this.a = i7;
        this.b = v5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v5 v5Var = this.b;
                v5Var.getClass();
                v5Var.d2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                v5 v5Var2 = this.b;
                v5Var2.getClass();
                v5Var2.d2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                v5 v5Var3 = this.b;
                v5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var3.L1 = floatValue;
                v5Var3.J1.setTransitionProgress(floatValue);
                break;
        }
    }
}

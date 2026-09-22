package ci;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ a5(r6 r6Var, int i10) {
        this.a = i10;
        this.b = r6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r6 r6Var = this.b;
                r6Var.getClass();
                r6Var.p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                r6 r6Var2 = this.b;
                r6Var2.getClass();
                r6Var2.p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                r6 r6Var3 = this.b;
                r6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var3.b2 = floatValue;
                r6Var3.Z1.setTransitionProgress(floatValue);
                break;
        }
    }
}

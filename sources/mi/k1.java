package mi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ k1(c2 c2Var, int i3) {
        this.a = i3;
        this.b = c2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                c2Var.getClass();
                c2Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.k0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2 c2Var2 = this.b;
                c2Var2.J = floatValue;
                c2Var2.A0();
                c2Var2.Q.setTranslationX(org.telegram.messenger.g0.W1(c2Var2.J, c2Var2.H[0] - c2Var2.I[0], 0));
                c2Var2.Q.setTranslationY(org.telegram.messenger.g0.W1(c2Var2.J, c2Var2.H[1] - c2Var2.I[1], 0));
                c2Var2.P.invalidate();
                break;
        }
    }
}

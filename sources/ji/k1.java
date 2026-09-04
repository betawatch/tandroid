package ji;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ k1(c2 c2Var, int i10) {
        this.a = i10;
        this.b = c2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                c2Var.getClass();
                c2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.f0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2 c2Var2 = this.b;
                c2Var2.I = floatValue;
                c2Var2.v0();
                c2Var2.P.setTranslationX(AndroidUtilities.lerp(c2Var2.G[0] - c2Var2.H[0], 0, c2Var2.I));
                c2Var2.P.setTranslationY(AndroidUtilities.lerp(c2Var2.G[1] - c2Var2.H[1], 0, c2Var2.I));
                c2Var2.O.invalidate();
                break;
        }
    }
}

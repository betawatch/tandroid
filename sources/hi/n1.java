package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ n1(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g2 g2Var = this.b;
                g2Var.getClass();
                g2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.f0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2 g2Var2 = this.b;
                g2Var2.I = floatValue;
                g2Var2.v0();
                g2Var2.P.setTranslationX(AndroidUtilities.lerp(g2Var2.G[0] - g2Var2.H[0], 0, g2Var2.I));
                g2Var2.P.setTranslationY(AndroidUtilities.lerp(g2Var2.G[1] - g2Var2.H[1], 0, g2Var2.I));
                g2Var2.O.invalidate();
                break;
        }
    }
}

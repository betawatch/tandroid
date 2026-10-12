package ji;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ k1(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d2 d2Var = this.b;
                d2Var.getClass();
                d2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var.f0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2 d2Var2 = this.b;
                d2Var2.I = floatValue;
                d2Var2.v0();
                d2Var2.P.setTranslationX(AndroidUtilities.lerp(d2Var2.G[0] - d2Var2.H[0], 0, d2Var2.I));
                d2Var2.P.setTranslationY(AndroidUtilities.lerp(d2Var2.G[1] - d2Var2.H[1], 0, d2Var2.I));
                d2Var2.O.invalidate();
                break;
        }
    }
}

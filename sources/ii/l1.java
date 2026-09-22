package ii;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ l1(d2 d2Var, int i10) {
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

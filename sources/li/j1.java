package li;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ j1(b2 b2Var, int i10) {
        this.a = i10;
        this.b = b2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b2 b2Var = this.b;
                b2Var.getClass();
                b2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.g0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2 b2Var2 = this.b;
                b2Var2.I = floatValue;
                b2Var2.w0();
                b2Var2.P.setTranslationX(AndroidUtilities.lerp(b2Var2.G[0] - b2Var2.H[0], 0, b2Var2.I));
                b2Var2.P.setTranslationY(AndroidUtilities.lerp(b2Var2.G[1] - b2Var2.H[1], 0, b2Var2.I));
                b2Var2.O.invalidate();
                break;
        }
    }
}

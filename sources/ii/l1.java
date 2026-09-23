package ii;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ l1(e2 e2Var, int i10) {
        this.a = i10;
        this.b = e2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                e2Var.getClass();
                e2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2Var.f0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2 e2Var2 = this.b;
                e2Var2.I = floatValue;
                e2Var2.v0();
                e2Var2.P.setTranslationX(AndroidUtilities.lerp(e2Var2.G[0] - e2Var2.H[0], 0, e2Var2.I));
                e2Var2.P.setTranslationY(AndroidUtilities.lerp(e2Var2.G[1] - e2Var2.H[1], 0, e2Var2.I));
                e2Var2.O.invalidate();
                break;
        }
    }
}

// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class i95 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l95 b;

    public /* synthetic */ i95(l95 l95Var, byte b) {
        this.a = b;
        this.b = l95Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        l95 l95Var = this.b;
        switch (b) {
            case 0:
                l95Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l95Var.invalidate();
                break;
            default:
                l95Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l95Var.c = floatValue;
                h75 h75Var = l95Var.k0;
                h75Var.u3.setAlpha(1.0f - floatValue);
                c65 c65Var = h75Var.H1;
                c65Var.setAlpha((1.0f - h75Var.T3.c) * (c65Var.getTag() != null ? 1.0f : 0.0f));
                h75Var.y1(h75Var.s2);
                l95Var.j();
                break;
        }
    }
}

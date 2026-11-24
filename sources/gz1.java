// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gz1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x02 b;

    public /* synthetic */ gz1(x02 x02Var, byte b) {
        this.a = b;
        this.b = x02Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        x02 x02Var = this.b;
        switch (b) {
            case 0:
                x02Var.L1();
                break;
            case 1:
                x02Var.A2.invalidate();
                break;
            case 2:
                x02Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ww0 ww0Var = x02Var.c;
                if (ww0Var != null) {
                    ww0Var.invalidate();
                    break;
                }
                break;
            case 3:
                x02Var.u1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                p02 p02Var = x02Var.v2;
                r32 r32Var = x02Var.q2;
                if (p02Var == r32Var && r32Var != null) {
                    r32Var.invalidate();
                    break;
                }
                break;
            default:
                x02Var.L1();
                break;
        }
    }
}

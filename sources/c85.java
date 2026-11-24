// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class c85 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h85 b;

    public /* synthetic */ c85(h85 h85Var, byte b) {
        this.a = b;
        this.b = h85Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        byte b = this.a;
        h85 h85Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h85Var.a0 = floatValue;
                h85Var.b0.setAlpha(floatValue);
                h85Var.a.invalidate();
                break;
            default:
                d85 d85Var = h85Var.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z = false;
                } else {
                    floatValue2 -= 1.0f;
                    z = true;
                }
                if (z && !h85Var.I0) {
                    h85Var.x0.setAlpha(1.0f);
                    h85Var.I0 = true;
                    d85Var.d.clearImage();
                }
                float f = floatValue2 * 180.0f;
                h85Var.x0.setRotationY(f);
                d85Var.d.setRotationY(f);
                break;
        }
    }
}

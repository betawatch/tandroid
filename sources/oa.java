// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class oa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pa b;
    public final /* synthetic */ u43 c;

    public /* synthetic */ oa(pa paVar, u43 u43Var, byte b) {
        this.a = b;
        this.b = paVar;
        this.c = u43Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        u43 u43Var = this.c;
        pa paVar = this.b;
        switch (b) {
            case 0:
                paVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u43Var.invalidate();
                break;
            default:
                paVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u43Var.invalidate();
                break;
        }
    }
}

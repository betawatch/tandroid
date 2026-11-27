// default package

import android.animation.ValueAnimator;
import android.view.WindowManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class alc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dlc b;

    public /* synthetic */ alc(dlc dlcVar, byte b) {
        this.a = b;
        this.b = dlcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dlc dlcVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams = dlcVar.d;
                layoutParams.x = (int) floatValue;
                hl.N3(dlcVar.c, dlcVar.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams2 = dlcVar.d;
                layoutParams2.y = (int) floatValue2;
                hl.N3(dlcVar.c, dlcVar.a, layoutParams2);
                break;
        }
    }
}

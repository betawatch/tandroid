// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class iic implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kic b;

    public /* synthetic */ iic(kic kicVar, byte b) {
        this.a = b;
        this.b = kicVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kic kicVar = this.b;
        switch (b) {
            case 0:
                kicVar.getClass();
                kicVar.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kicVar.invalidate();
                kicVar.U.c();
                break;
            case 1:
                kicVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kicVar.invalidate();
                kicVar.U.c();
                break;
            case 2:
                kicVar.getClass();
                kicVar.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kicVar.invalidate();
                kicVar.U.c();
                break;
            case 3:
                kicVar.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kicVar.invalidate();
                break;
            case 4:
                kicVar.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kicVar.invalidate();
                break;
            default:
                kicVar.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kicVar.invalidate();
                break;
        }
    }
}

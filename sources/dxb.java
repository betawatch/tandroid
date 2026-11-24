// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dxb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fxb b;

    public /* synthetic */ dxb(fxb fxbVar, byte b) {
        this.a = b;
        this.b = fxbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fxb fxbVar = this.b;
        switch (b) {
            case 0:
                rj4 rj4Var = fxbVar.f;
                rj4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                rj4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                rj4Var.invalidate();
                break;
            default:
                fxbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fxbVar.h();
                break;
        }
    }
}

// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class he1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ie1 b;

    public /* synthetic */ he1(ie1 ie1Var, byte b) {
        this.a = b;
        this.b = ie1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ie1 ie1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ie1Var.n = floatValue;
                ie1Var.f.setTranslationX(floatValue * gl.L(16.0f));
                ie1Var.d.setAlpha(ie1Var.n);
                break;
            default:
                ie1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = bkb.y6;
                wjb wjbVar = ie1Var.b;
                int f = bm2.f(ie1Var.F, bkb.v0(i, wjbVar), bkb.v0(bkb.m6, wjbVar));
                ie1Var.e.b(f);
                ie1Var.f.setTextColor(f);
                break;
        }
    }
}

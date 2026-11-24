// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

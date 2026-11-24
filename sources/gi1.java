// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gi1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public boolean b = false;
    public final /* synthetic */ jm7 c;

    public /* synthetic */ gi1(jm7 jm7Var, byte b) {
        this.a = b;
        this.c = jm7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                vi1 vi1Var = (vi1) jm7Var;
                vi1Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi1Var.n0.invalidate();
                if (!this.b && vi1Var.o0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                d38 d38Var = (d38) jm7Var;
                d38Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d38Var.Y.invalidate();
                if (!this.b && d38Var.Z > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                v9b v9bVar = (v9b) jm7Var;
                v9bVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9b f9bVar = v9bVar.D2;
                if (f9bVar != null) {
                    f9bVar.invalidate();
                }
                if (!this.b && v9bVar.E2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                rob robVar = (rob) jm7Var;
                robVar.k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                robVar.j2.invalidate();
                if (!this.b && robVar.k2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}

// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gic implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hic b;

    public /* synthetic */ gic(hic hicVar, byte b) {
        this.a = b;
        this.b = hicVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hic hicVar = this.b;
        switch (b) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                hicVar.d = intValue;
                hicVar.e = intValue;
                hicVar.f = intValue;
                hicVar.h = intValue;
                hicVar.n = intValue;
                hicVar.invalidate();
                break;
            default:
                hicVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hicVar.d = gl.U1(floatValue, hicVar.G, gl.L(56.0f));
                hicVar.e = gl.U1(floatValue, hicVar.G, gl.L(36.0f));
                hicVar.f = gl.U1(floatValue, hicVar.G, gl.L(60.0f));
                hicVar.h = gl.U1(floatValue, hicVar.G, gl.L(36.0f));
                hicVar.n = gl.U1(floatValue, hicVar.G, gl.L(64.0f));
                hicVar.r = gl.U1(floatValue, 0, gl.L(50.0f));
                hicVar.s = gl.U1(floatValue, 0, gl.L(20.0f));
                hicVar.w = gl.U1(floatValue, 0, 0);
                hicVar.x = gl.U1(floatValue, 0, gl.L(-20.0f));
                hicVar.y = gl.U1(floatValue, 0, gl.L(-40.0f));
                hicVar.invalidate();
                break;
        }
    }
}

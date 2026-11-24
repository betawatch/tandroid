// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k3b b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ d3b(k3b k3bVar, float f, float f2, byte b) {
        this.a = b;
        this.b = k3bVar;
        this.c = f;
        this.d = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.d;
        float f2 = this.c;
        k3b k3bVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3bVar.setScrollY((int) gl.R1(f2, 0.0f, floatValue));
                j3b j3bVar = k3bVar.b0;
                j3bVar.x = gl.R1(f, 0.0f, floatValue);
                j3bVar.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3bVar.setScrollY((int) gl.R1(f2, Math.min((k3bVar.getMeasuredHeight() - k3bVar.u0) - gl.L(64.0f), k3bVar.r0.getBottom() - k3bVar.getMeasuredHeight()), floatValue2));
                j3b j3bVar2 = k3bVar.b0;
                j3bVar2.x = gl.R1(f, 1.0f, floatValue2);
                j3bVar2.invalidate();
                break;
        }
    }
}

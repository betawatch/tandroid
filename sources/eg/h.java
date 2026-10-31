package eg;

import android.animation.ValueAnimator;
import c3.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ h(q qVar, float f7, float[] fArr, float f10, float f11, int i10) {
        this.a = i10;
        this.b = qVar;
        this.c = f7;
        this.d = fArr;
        this.e = f10;
        this.f = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q qVar = this.b;
                qVar.getClass();
                float z10 = i0.z(this.c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f7 = fArr[0];
                float f10 = z10 / f7;
                fArr[0] = f7 * f10;
                o.g(qVar.L, f10, this.e, this.f);
                qVar.r(false);
                break;
            default:
                q qVar2 = this.b;
                qVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = this.c * floatValue;
                float[] fArr2 = this.d;
                float f12 = fArr2[1];
                float f13 = f11 - f12;
                fArr2[1] = f12 + f13;
                float f14 = this.e * floatValue;
                float f15 = fArr2[2];
                float f16 = f14 - f15;
                fArr2[2] = f15 + f16;
                o oVar = qVar2.L;
                float f17 = fArr2[0];
                o.f(oVar, f13 * f17, f16 * f17);
                float f18 = ((this.f - 1.0f) * floatValue) + 1.0f;
                float f19 = fArr2[0];
                float f20 = f18 / f19;
                fArr2[0] = f19 * f20;
                o.g(qVar2.L, f20, 0.0f, 0.0f);
                qVar2.r(false);
                break;
        }
    }
}

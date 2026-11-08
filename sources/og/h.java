package og;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ h(o oVar, float f10, float[] fArr, float f11, float f12, int i7) {
        this.a = i7;
        this.b = oVar;
        this.c = f10;
        this.d = fArr;
        this.e = f11;
        this.f = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o oVar = this.b;
                oVar.getClass();
                float z9 = com.google.android.recaptcha.internal.a.z(this.c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f10 = fArr[0];
                float f11 = z9 / f10;
                fArr[0] = f10 * f11;
                m.g(oVar.L, f11, this.e, this.f);
                oVar.r(false);
                break;
            default:
                o oVar2 = this.b;
                oVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.c * floatValue;
                float[] fArr2 = this.d;
                float f13 = fArr2[1];
                float f14 = f12 - f13;
                fArr2[1] = f13 + f14;
                float f15 = this.e * floatValue;
                float f16 = fArr2[2];
                float f17 = f15 - f16;
                fArr2[2] = f16 + f17;
                m mVar = oVar2.L;
                float f18 = fArr2[0];
                m.f(mVar, f14 * f18, f17 * f18);
                float f19 = ((this.f - 1.0f) * floatValue) + 1.0f;
                float f20 = fArr2[0];
                float f21 = f19 / f20;
                fArr2[0] = f20 * f21;
                m.g(oVar2.L, f21, 0.0f, 0.0f);
                oVar2.r(false);
                break;
        }
    }
}

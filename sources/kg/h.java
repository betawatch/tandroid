package kg;

import android.animation.ValueAnimator;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ h(p pVar, float f7, float[] fArr, float f10, float f11, int i10) {
        this.a = i10;
        this.b = pVar;
        this.c = f7;
        this.d = fArr;
        this.e = f10;
        this.f = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                pVar.getClass();
                float z10 = e2.z(this.c, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.d;
                float f7 = fArr[0];
                float f10 = z10 / f7;
                fArr[0] = f7 * f10;
                n.g(pVar.L, f10, this.e, this.f);
                pVar.r(false);
                break;
            default:
                p pVar2 = this.b;
                pVar2.getClass();
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
                n nVar = pVar2.L;
                float f17 = fArr2[0];
                n.f(nVar, f13 * f17, f16 * f17);
                float f18 = ((this.f - 1.0f) * floatValue) + 1.0f;
                float f19 = fArr2[0];
                float f20 = f18 / f19;
                fArr2[0] = f19 * f20;
                n.g(pVar2.L, f20, 0.0f, 0.0f);
                pVar2.r(false);
                break;
        }
    }
}

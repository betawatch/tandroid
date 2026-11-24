// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d33 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j33 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ d33(j33 j33Var, float f, float[] fArr, float f2, float f3, byte b) {
        this.a = b;
        this.b = j33Var;
        this.c = f;
        this.d = fArr;
        this.e = f2;
        this.f = f3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.f;
        float f2 = this.e;
        float[] fArr = this.d;
        float f3 = this.c;
        j33 j33Var = this.b;
        switch (b) {
            case 0:
                float A = tb4.A(f3, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float f4 = fArr[0];
                float f5 = A / f4;
                fArr[0] = f4 * f5;
                j33Var.M.f(f5, f2, f);
                j33Var.r(false);
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f6 = fArr[1];
                float f7 = (f3 * floatValue) - f6;
                fArr[1] = f6 + f7;
                float f8 = fArr[2];
                float f9 = (f2 * floatValue) - f8;
                fArr[2] = f8 + f9;
                h33 h33Var = j33Var.M;
                float f10 = fArr[0];
                h33Var.g(f7 * f10, f9 * f10);
                float f11 = ((f - 1.0f) * floatValue) + 1.0f;
                float f12 = fArr[0];
                float f13 = f11 / f12;
                fArr[0] = f12 * f13;
                j33Var.M.f(f13, 0.0f, 0.0f);
                j33Var.r(false);
                break;
        }
    }
}

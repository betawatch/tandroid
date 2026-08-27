package lh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b7(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.a = i10;
        this.f = obj;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q qVar = (q) this.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c7 c7Var = qVar.a;
                float f10 = this.b;
                float f11 = this.c;
                c7Var.setScaleX(AndroidUtilities.lerp(f10, f11, floatValue));
                c7Var.setScaleY(AndroidUtilities.lerp(f10, f11, floatValue));
                c7Var.setTranslationX(this.d * floatValue);
                c7Var.setTranslationY(this.e * floatValue);
                float f12 = 1.0f - floatValue;
                c7Var.setAlpha(f12);
                qVar.s = f12;
                qVar.invalidate();
                break;
            default:
                rf.j jVar = (rf.j) this.f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.c;
                float f14 = this.b;
                jVar.k = com.google.android.recaptcha.internal.a.z(f13, f14, floatValue2, f14);
                float f15 = this.e;
                float f16 = this.d;
                jVar.l = com.google.android.recaptcha.internal.a.z(f15, f16, floatValue2, f16);
                jVar.a.a(f13, f15, false);
                break;
        }
    }
}

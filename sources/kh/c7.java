package kh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c7(Object obj, float f10, float f11, float f12, float f13, int i9) {
        this.a = i9;
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
                d7 d7Var = qVar.a;
                float f10 = this.b;
                float f11 = this.c;
                d7Var.setScaleX(AndroidUtilities.lerp(f10, f11, floatValue));
                d7Var.setScaleY(AndroidUtilities.lerp(f10, f11, floatValue));
                d7Var.setTranslationX(this.d * floatValue);
                d7Var.setTranslationY(this.e * floatValue);
                float f12 = 1.0f - floatValue;
                d7Var.setAlpha(f12);
                qVar.s = f12;
                qVar.invalidate();
                break;
            default:
                qf.j jVar = (qf.j) this.f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.c;
                float f14 = this.b;
                jVar.k = e2.c.z(f13, f14, floatValue2, f14);
                float f15 = this.e;
                float f16 = this.d;
                jVar.l = e2.c.z(f15, f16, floatValue2, f16);
                jVar.a.a(f13, f15, false);
                break;
        }
    }
}

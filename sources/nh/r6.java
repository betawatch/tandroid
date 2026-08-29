package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r6(Object obj, float f9, float f10, float f11, float f12, int i10) {
        this.a = i10;
        this.f = obj;
        this.b = f9;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p pVar = (p) this.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6 s6Var = pVar.a;
                float f9 = this.b;
                float f10 = this.c;
                s6Var.setScaleX(AndroidUtilities.lerp(f9, f10, floatValue));
                s6Var.setScaleY(AndroidUtilities.lerp(f9, f10, floatValue));
                s6Var.setTranslationX(this.d * floatValue);
                s6Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                s6Var.setAlpha(f11);
                pVar.s = f11;
                pVar.invalidate();
                break;
            default:
                tf.j jVar = (tf.j) this.f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.c;
                float f13 = this.b;
                jVar.k = com.google.android.recaptcha.internal.a.z(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                jVar.l = com.google.android.recaptcha.internal.a.z(f14, f15, floatValue2, f15);
                jVar.a.a(f12, f14, false);
                break;
        }
    }
}

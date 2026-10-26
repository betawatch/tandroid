package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z6(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.a = i10;
        this.f = obj;
        this.b = f7;
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
                a7 a7Var = pVar.a;
                float f7 = this.b;
                float f10 = this.c;
                a7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                a7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                a7Var.setTranslationX(this.d * floatValue);
                a7Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                a7Var.setAlpha(f11);
                pVar.s = f11;
                pVar.invalidate();
                break;
            case 1:
                kg.k kVar = (kg.k) this.f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.c;
                float f13 = this.b;
                kVar.k = c3.h0.z(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                kVar.l = c3.h0.z(f14, f15, floatValue2, f15);
                kVar.a.a(f12, f14, false);
                break;
            default:
                ug.e eVar = (ug.e) this.f;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug.g gVar = ((ug.f) eVar.b).a;
                float f16 = this.c;
                float f17 = this.b;
                gVar.d = c3.h0.z(f16, f17, floatValue3, f17);
                float f18 = this.e;
                float f19 = this.d;
                gVar.i = c3.h0.z(f18, f19, floatValue3, f19);
                break;
        }
    }
}

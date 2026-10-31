package bg;

import android.animation.ValueAnimator;
import c3.i0;
import vh.u4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j(Object obj, float f7, float f10, float f11, float f12, int i10) {
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
                n nVar = (n) this.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = this.c;
                float f10 = this.b;
                nVar.k = i0.z(f7, f10, floatValue, f10);
                float f11 = this.e;
                float f12 = this.d;
                nVar.l = i0.z(f11, f12, floatValue, f12);
                nVar.a.a(f7, f11, false);
                break;
            case 1:
                lg.f fVar = (lg.f) this.f;
                fVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.h hVar = ((lg.g) fVar.b).a;
                float f13 = this.c;
                float f14 = this.b;
                hVar.d = i0.z(f13, f14, floatValue2, f14);
                float f15 = this.e;
                float f16 = this.d;
                hVar.i = i0.z(f15, f16, floatValue2, f16);
                break;
            default:
                vh.n nVar2 = (vh.n) this.f;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u4 u4Var = nVar2.a;
                float f17 = this.b;
                float f18 = this.c;
                u4Var.setScaleX(org.telegram.messenger.i0.T1(f17, f18, floatValue3));
                u4Var.setScaleY(org.telegram.messenger.i0.T1(f17, f18, floatValue3));
                u4Var.setTranslationX(this.d * floatValue3);
                u4Var.setTranslationY(this.e * floatValue3);
                float f19 = 1.0f - floatValue3;
                u4Var.setAlpha(f19);
                nVar2.s = f19;
                nVar2.invalidate();
                break;
        }
    }
}

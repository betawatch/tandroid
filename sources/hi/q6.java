package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q6(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.a = i7;
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
                r6 r6Var = qVar.a;
                float f10 = this.b;
                float f11 = this.c;
                r6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                r6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                r6Var.setTranslationX(this.d * floatValue);
                r6Var.setTranslationY(this.e * floatValue);
                float f12 = 1.0f - floatValue;
                r6Var.setAlpha(f12);
                qVar.s = f12;
                qVar.invalidate();
                break;
            case 1:
                lg.j jVar = (lg.j) this.f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.c;
                float f14 = this.b;
                jVar.k = com.google.android.gms.internal.vision.e2.z(f13, f14, floatValue2, f14);
                float f15 = this.e;
                float f16 = this.d;
                jVar.l = com.google.android.gms.internal.vision.e2.z(f15, f16, floatValue2, f16);
                jVar.a.a(f13, f15, false);
                break;
            default:
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) this.f;
                y9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = ((vg.e) y9Var.b).a;
                float f17 = this.c;
                float f18 = this.b;
                fVar.d = com.google.android.gms.internal.vision.e2.z(f17, f18, floatValue3, f18);
                float f19 = this.e;
                float f20 = this.d;
                fVar.i = com.google.android.gms.internal.vision.e2.z(f19, f20, floatValue3, f20);
                break;
        }
    }
}

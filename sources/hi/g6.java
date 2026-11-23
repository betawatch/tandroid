package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g6(Object obj, float f10, float f11, float f12, float f13, int i7) {
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
                r rVar = (r) this.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h6 h6Var = rVar.a;
                float f10 = this.b;
                float f11 = this.c;
                h6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                h6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                h6Var.setTranslationX(this.d * floatValue);
                h6Var.setTranslationY(this.e * floatValue);
                float f12 = 1.0f - floatValue;
                h6Var.setAlpha(f12);
                rVar.s = f12;
                rVar.invalidate();
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
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.f;
                z9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = ((vg.e) z9Var.b).a;
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

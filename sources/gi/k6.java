package gi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k6(Object obj, float f10, float f11, float f12, float f13, int i3) {
        this.a = i3;
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
                p pVar = (p) this.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6 l6Var = pVar.a;
                float f10 = this.b;
                float f11 = this.c;
                l6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                l6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                l6Var.setTranslationX(this.d * floatValue);
                l6Var.setTranslationY(this.e * floatValue);
                float f12 = 1.0f - floatValue;
                l6Var.setAlpha(f12);
                pVar.s = f12;
                pVar.invalidate();
                break;
            case 1:
                mg.j jVar = (mg.j) this.f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.c;
                float f14 = this.b;
                jVar.k = com.google.android.recaptcha.internal.a.y(f13, f14, floatValue2, f14);
                float f15 = this.e;
                float f16 = this.d;
                jVar.l = com.google.android.recaptcha.internal.a.y(f15, f16, floatValue2, f16);
                jVar.a.a(f13, f15, false);
                break;
            default:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.f;
                x9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg.f fVar = ((wg.e) x9Var.b).a;
                float f17 = this.c;
                float f18 = this.b;
                fVar.d = com.google.android.recaptcha.internal.a.y(f17, f18, floatValue3, f18);
                float f19 = this.e;
                float f20 = this.d;
                fVar.i = com.google.android.recaptcha.internal.a.y(f19, f20, floatValue3, f20);
                break;
        }
    }
}

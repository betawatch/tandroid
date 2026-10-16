package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l7(Object obj, float f7, float f10, float f11, float f12, int i10) {
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
                m7 m7Var = pVar.a;
                float f7 = this.b;
                float f10 = this.c;
                m7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                m7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                m7Var.setTranslationX(this.d * floatValue);
                m7Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                m7Var.setAlpha(f11);
                pVar.s = f11;
                pVar.invalidate();
                break;
            case 1:
                jg.j jVar = (jg.j) this.f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.c;
                float f13 = this.b;
                jVar.k = com.google.android.gms.internal.play_billing.k3.y(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                jVar.l = com.google.android.gms.internal.play_billing.k3.y(f14, f15, floatValue2, f15);
                jVar.a.a(f12, f14, false);
                break;
            default:
                tg.e eVar = (tg.e) this.f;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = ((tg.f) eVar.b).a;
                float f16 = this.c;
                float f17 = this.b;
                gVar.d = com.google.android.gms.internal.play_billing.k3.y(f16, f17, floatValue3, f17);
                float f18 = this.e;
                float f19 = this.d;
                gVar.i = com.google.android.gms.internal.play_billing.k3.y(f18, f19, floatValue3, f19);
                break;
        }
    }
}

package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c7(Object obj, float f7, float f10, float f11, float f12, int i10) {
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
                d7 d7Var = pVar.a;
                float f7 = this.b;
                float f10 = this.c;
                d7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                d7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                d7Var.setTranslationX(this.d * floatValue);
                d7Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                d7Var.setAlpha(f11);
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

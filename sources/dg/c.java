package dg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.voip.l0;
import org.telegram.ui.oh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, float f9, float f10, float f11, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = f9;
        this.c = f10;
        this.d = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i iVar = (i) this.e;
                iVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a aVar = iVar.b;
                aVar.d = this.b * floatValue;
                aVar.e = this.c * floatValue;
                aVar.g = floatValue * this.d;
                break;
            case 1:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.u0 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                l0Var.n0 = this.c * floatValue2;
                l0Var.o0 = this.d * floatValue2;
                l0Var.invalidate();
                break;
            default:
                oh1 oh1Var = (oh1) this.e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oh1Var.b1 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue3, 1.0f, this.b * floatValue3);
                oh1Var.U0 = this.c * floatValue3;
                oh1Var.V0 = this.d * floatValue3;
                oh1Var.s.invalidate();
                break;
        }
    }
}

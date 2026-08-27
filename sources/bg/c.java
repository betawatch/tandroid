package bg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.voip.k0;
import org.telegram.ui.lh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, float f10, float f11, float f12, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = f10;
        this.c = f11;
        this.d = f12;
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
                k0 k0Var = (k0) this.e;
                k0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.u0 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                k0Var.n0 = this.c * floatValue2;
                k0Var.o0 = this.d * floatValue2;
                k0Var.invalidate();
                break;
            default:
                lh1 lh1Var = (lh1) this.e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lh1Var.b1 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue3, 1.0f, this.b * floatValue3);
                lh1Var.U0 = this.c * floatValue3;
                lh1Var.V0 = this.d * floatValue3;
                lh1Var.s.invalidate();
                break;
        }
    }
}

package ag;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.voip.k0;
import org.telegram.ui.mh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, float f10, float f11, float f12, int i9) {
        this.a = i9;
        this.e = obj;
        this.b = f10;
        this.c = f11;
        this.d = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.e;
                jVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a aVar = jVar.b;
                aVar.d = this.b * floatValue;
                aVar.e = this.c * floatValue;
                aVar.g = floatValue * this.d;
                break;
            case 1:
                k0 k0Var = (k0) this.e;
                k0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.u0 = e2.c.z(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                k0Var.n0 = this.c * floatValue2;
                k0Var.o0 = this.d * floatValue2;
                k0Var.invalidate();
                break;
            default:
                mh1 mh1Var = (mh1) this.e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh1Var.b1 = e2.c.z(1.0f, floatValue3, 1.0f, this.b * floatValue3);
                mh1Var.U0 = this.c * floatValue3;
                mh1Var.V0 = this.d * floatValue3;
                mh1Var.s.invalidate();
                break;
        }
    }
}

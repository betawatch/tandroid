package fg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.voip.k0;
import org.telegram.ui.ai1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                k0Var.v0 = e2.c.w(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                k0Var.o0 = this.c * floatValue2;
                k0Var.p0 = this.d * floatValue2;
                k0Var.invalidate();
                break;
            default:
                ai1 ai1Var = (ai1) this.e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ai1Var.c1 = e2.c.w(1.0f, floatValue3, 1.0f, this.b * floatValue3);
                ai1Var.V0 = this.c * floatValue3;
                ai1Var.W0 = this.d * floatValue3;
                ai1Var.s.invalidate();
                break;
        }
    }
}

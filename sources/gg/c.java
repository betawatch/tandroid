package gg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.voip.l0;
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.v0 = e2.c.w(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                l0Var.o0 = this.c * floatValue2;
                l0Var.p0 = this.d * floatValue2;
                l0Var.invalidate();
                break;
            default:
                ii1 ii1Var = (ii1) this.e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii1Var.c1 = e2.c.w(1.0f, floatValue3, 1.0f, this.b * floatValue3);
                ii1Var.V0 = this.c * floatValue3;
                ii1Var.W0 = this.d * floatValue3;
                ii1Var.s.invalidate();
                break;
        }
    }
}

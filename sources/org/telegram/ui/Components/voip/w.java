package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ph1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(Object obj, float f7, float f10, float f11, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = f7;
        this.c = f10;
        this.d = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.y0 = c3.h0.z(1.0f, floatValue, 1.0f, this.b * floatValue);
                l0Var.r0 = this.c * floatValue;
                l0Var.s0 = this.d * floatValue;
                l0Var.invalidate();
                break;
            case 1:
                ph1 ph1Var = (ph1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph1Var.f1 = c3.h0.z(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                ph1Var.Y0 = this.c * floatValue2;
                ph1Var.Z0 = this.d * floatValue2;
                ph1Var.s.invalidate();
                break;
            default:
                ug.n nVar = (ug.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug.g gVar = nVar.b;
                gVar.d = this.b * floatValue3;
                gVar.e = this.c * floatValue3;
                gVar.i = floatValue3 * this.d;
                break;
        }
    }
}

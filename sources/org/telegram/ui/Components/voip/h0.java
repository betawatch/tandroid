package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h0(Object obj, float f10, float f11, float f12, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = f10;
        this.c = f11;
        this.d = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) this.e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.y0 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue, 1.0f, this.b * floatValue);
                k0Var.r0 = this.c * floatValue;
                k0Var.s0 = this.d * floatValue;
                k0Var.invalidate();
                break;
            case 1:
                fc1 fc1Var = (fc1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc1Var.e1 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                fc1Var.X0 = this.c * floatValue2;
                fc1Var.Y0 = this.d * floatValue2;
                fc1Var.s.invalidate();
                break;
            default:
                vg.m mVar = (vg.m) this.e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.b;
                fVar.d = this.b * floatValue3;
                fVar.e = this.c * floatValue3;
                fVar.i = floatValue3 * this.d;
                break;
        }
    }
}

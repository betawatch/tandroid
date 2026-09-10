package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
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
                m0 m0Var = (m0) this.e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.b * floatValue);
                m0Var.r0 = this.c * floatValue;
                m0Var.s0 = this.d * floatValue;
                m0Var.invalidate();
                break;
            case 1:
                zi1 zi1Var = (zi1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zi1Var.f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                zi1Var.Y0 = this.c * floatValue2;
                zi1Var.Z0 = this.d * floatValue2;
                zi1Var.s.invalidate();
                break;
            default:
                rg.f fVar = (rg.f) this.e;
                fVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rg.a aVar = fVar.b;
                aVar.d = this.b * floatValue3;
                aVar.e = this.c * floatValue3;
                aVar.g = floatValue3 * this.d;
                break;
        }
    }
}

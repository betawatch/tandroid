package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ti1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x(Object obj, float f7, float f10, float f11, int i10) {
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
                ti1 ti1Var = (ti1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti1Var.f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                ti1Var.Y0 = this.c * floatValue2;
                ti1Var.Z0 = this.d * floatValue2;
                ti1Var.s.invalidate();
                break;
            default:
                sg.e eVar = (sg.e) this.e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.b;
                aVar.d = this.b * floatValue3;
                aVar.e = this.c * floatValue3;
                aVar.g = floatValue3 * this.d;
                break;
        }
    }
}

package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.wi1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
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
                m0Var.y0 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue, 1.0f, this.b * floatValue);
                m0Var.r0 = this.c * floatValue;
                m0Var.s0 = this.d * floatValue;
                m0Var.invalidate();
                break;
            case 1:
                wi1 wi1Var = (wi1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi1Var.f1 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                wi1Var.Y0 = this.c * floatValue2;
                wi1Var.Z0 = this.d * floatValue2;
                wi1Var.s.invalidate();
                break;
            default:
                sg.n nVar = (sg.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = nVar.b;
                gVar.d = this.b * floatValue3;
                gVar.e = this.c * floatValue3;
                gVar.i = floatValue3 * this.d;
                break;
        }
    }
}

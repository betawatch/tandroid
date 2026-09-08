package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ui1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.b * floatValue);
                l0Var.r0 = this.c * floatValue;
                l0Var.s0 = this.d * floatValue;
                l0Var.invalidate();
                break;
            case 1:
                ui1 ui1Var = (ui1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                ui1Var.Y0 = this.c * floatValue2;
                ui1Var.Z0 = this.d * floatValue2;
                ui1Var.s.invalidate();
                break;
            default:
                tg.e eVar = (tg.e) this.e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.a aVar = eVar.b;
                aVar.d = this.b * floatValue3;
                aVar.e = this.c * floatValue3;
                aVar.g = floatValue3 * this.d;
                break;
        }
    }
}

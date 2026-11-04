package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u(Object obj, float f10, float f11, float f12, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = f10;
        this.c = f11;
        this.d = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x xVar = (x) this.e;
                xVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.z0 = com.google.android.recaptcha.internal.a.y(1.0f, floatValue, 1.0f, this.b * floatValue);
                xVar.s0 = this.c * floatValue;
                xVar.t0 = this.d * floatValue;
                xVar.invalidate();
                break;
            case 1:
                zb1 zb1Var = (zb1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb1Var.g1 = com.google.android.recaptcha.internal.a.y(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                zb1Var.Z0 = this.c * floatValue2;
                zb1Var.a1 = this.d * floatValue2;
                zb1Var.s.invalidate();
                break;
            default:
                wg.m mVar = (wg.m) this.e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg.f fVar = mVar.b;
                fVar.d = this.b * floatValue3;
                fVar.e = this.c * floatValue3;
                fVar.i = floatValue3 * this.d;
                break;
        }
    }
}

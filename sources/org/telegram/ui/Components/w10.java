package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ w10(View view, int i10, int i11, int i12, int i13, int i14) {
        this.a = i14;
        this.f = view;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.c;
        int i14 = this.b;
        View view = this.f;
        switch (i10) {
            case 0:
                y10 y10Var = (y10) view;
                y10Var.L = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                y10Var.M = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                y10Var.F.setColorFilter(new PorterDuffColorFilter(y10Var.L, PorterDuff.Mode.MULTIPLY));
                y10Var.E.setColor(y10Var.L);
                y10Var.r.setColor(y10Var.M);
                y10Var.J.d(i0.b.o(y10Var.M, 38));
                y10Var.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                rVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.D0 = i0.b.f(floatValue, i14, i13);
                int f7 = i0.b.f(floatValue, i12, i11);
                rVar.F0 = f7;
                rVar.T.setColor(f7);
                if (rVar.S > 0.0f) {
                    rVar.invalidate();
                    break;
                }
                break;
            default:
                rh.v8 v8Var = (rh.v8) view;
                v8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.r = i0.b.f(floatValue2, i14, i13);
                v8Var.s = i0.b.f(floatValue2, i12, i11);
                v8Var.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{v8Var.r, v8Var.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                v8Var.invalidate();
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ q20(View view, int i10, int i11, int i12, int i13, int i14) {
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
                r20 r20Var = (r20) view;
                r20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                r20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                r20Var.F.setColorFilter(new PorterDuffColorFilter(r20Var.L, PorterDuff.Mode.MULTIPLY));
                r20Var.E.setColor(r20Var.L);
                r20Var.r.setColor(r20Var.M);
                r20Var.J.d(i0.a.k(r20Var.M, 38));
                r20Var.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) view;
                uVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.D0 = i0.a.d(floatValue, i14, i13);
                int d = i0.a.d(floatValue, i12, i11);
                uVar.F0 = d;
                uVar.T.setColor(d);
                if (uVar.S > 0.0f) {
                    uVar.invalidate();
                    break;
                }
                break;
            default:
                yh.n8 n8Var = (yh.n8) view;
                n8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n8Var.r = i0.a.d(floatValue2, i14, i13);
                n8Var.s = i0.a.d(floatValue2, i12, i11);
                n8Var.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{n8Var.r, n8Var.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                n8Var.invalidate();
                break;
        }
    }
}

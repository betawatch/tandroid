package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i5(Object obj, float f10, float f11, float f12, float f13, int i3) {
        this.a = i3;
        this.f = obj;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.a;
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.c;
        float f13 = this.b;
        Object obj = this.f;
        switch (i3) {
            case 0:
                p5 p5Var = (p5) obj;
                p5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.lastDrawnCy = org.telegram.messenger.g0.T1(f13, f12, floatValue);
                p5Var.lastDrawnCx = org.telegram.messenger.g0.T1(f11, f10, floatValue);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.t5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float y9 = com.google.android.recaptcha.internal.a.y(f12, f13, floatValue2, f13);
                fn0 fn0Var = chatActivityEnterView.q0;
                if (fn0Var != null) {
                    fn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.q0.setTranslationX(y9);
                }
                chatActivityEnterView.R0.setTranslationX(y9);
                chatActivityEnterView.H = y9;
                chatActivityEnterView.K1();
                break;
        }
    }
}

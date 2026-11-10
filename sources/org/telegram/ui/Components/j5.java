package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j5(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.a = i7;
        this.f = obj;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.c;
        float f13 = this.b;
        Object obj = this.f;
        switch (i7) {
            case 0:
                q5 q5Var = (q5) obj;
                q5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.lastDrawnCy = org.telegram.messenger.g0.T1(f13, f12, floatValue);
                q5Var.lastDrawnCx = org.telegram.messenger.g0.T1(f11, f10, floatValue);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.s5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z9 = com.google.android.recaptcha.internal.a.z(f12, f13, floatValue2, f13);
                cn0 cn0Var = chatActivityEnterView.p0;
                if (cn0Var != null) {
                    cn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.p0.setTranslationX(z9);
                }
                chatActivityEnterView.Q0.setTranslationX(z9);
                chatActivityEnterView.G = z9;
                chatActivityEnterView.L1();
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q5(Object obj, float f10, float f11, float f12, float f13, int i7) {
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
                x5 x5Var = (x5) obj;
                x5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var.lastDrawnCy = org.telegram.messenger.g0.T1(f13, f12, floatValue);
                x5Var.lastDrawnCx = org.telegram.messenger.g0.T1(f11, f10, floatValue);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i10 = ChatActivityEnterView.n7;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                pn0 pn0Var = chatActivityEnterView.q0;
                if (pn0Var != null) {
                    pn0Var.setAlpha(((f10 - f11) * floatValue2) + f11);
                    chatActivityEnterView.q0.setTranslationX(z10);
                }
                chatActivityEnterView.R0.setTranslationX(z10);
                chatActivityEnterView.H = z10;
                chatActivityEnterView.m2();
                break;
        }
    }
}

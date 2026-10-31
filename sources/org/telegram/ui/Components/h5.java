package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h5(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.a = i10;
        this.f = obj;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.c;
        float f12 = this.b;
        Object obj = this.f;
        switch (i10) {
            case 0:
                o5 o5Var = (o5) obj;
                o5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.lastDrawnCy = org.telegram.messenger.i0.T1(f12, f11, floatValue);
                o5Var.lastDrawnCx = org.telegram.messenger.i0.T1(f10, f7, floatValue);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i11 = ChatActivityEnterView.s5;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float z10 = c3.i0.z(f11, f12, floatValue2, f12);
                do0 do0Var = chatActivityEnterView.p0;
                if (do0Var != null) {
                    do0Var.setAlpha(((f7 - f10) * floatValue2) + f10);
                    chatActivityEnterView.p0.setTranslationX(z10);
                }
                chatActivityEnterView.Q0.setTranslationX(z10);
                chatActivityEnterView.G = z10;
                chatActivityEnterView.I1();
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ sc(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                de deVar = chatActivityEnterView.J1;
                if (deVar != null) {
                    deVar.setTranslationX(deVar.a);
                    break;
                }
                break;
            case 1:
                de deVar2 = chatActivityEnterView.J1;
                if (deVar2 != null) {
                    deVar2.setTranslationX(deVar2.a);
                    break;
                }
                break;
            case 2:
                chatActivityEnterView.m1.invalidate();
                break;
            case 3:
                chatActivityEnterView.m1.invalidate();
                break;
            case 4:
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gf gfVar = chatActivityEnterView.U0;
                if (gfVar != null) {
                    gfVar.Z();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i12 = ChatActivityEnterView.s5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.c1) {
                    chatActivityEnterView.h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.h1.invalidate();
                }
                chatActivityEnterView.u0();
                break;
            default:
                int i13 = ChatActivityEnterView.s5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.w1.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.w1.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.w1.setAlpha(floatValue);
                break;
        }
    }
}

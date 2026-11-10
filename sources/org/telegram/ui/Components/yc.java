package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ yc(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                he heVar = chatActivityEnterView.J1;
                if (heVar != null) {
                    heVar.setTranslationX(heVar.a);
                    break;
                }
                break;
            case 1:
                he heVar2 = chatActivityEnterView.J1;
                if (heVar2 != null) {
                    heVar2.setTranslationX(heVar2.a);
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
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lf lfVar = chatActivityEnterView.U0;
                if (lfVar != null) {
                    lfVar.Z();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.c1) {
                    chatActivityEnterView.h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.h1.invalidate();
                }
                chatActivityEnterView.w0();
                break;
            default:
                int i12 = ChatActivityEnterView.s5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.w1.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.w1.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.w1.setAlpha(floatValue);
                break;
        }
    }
}

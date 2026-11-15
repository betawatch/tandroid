package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ gd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                je jeVar = chatActivityEnterView.r2;
                if (jeVar != null) {
                    jeVar.setTranslationX(jeVar.a);
                    break;
                }
                break;
            case 1:
                je jeVar2 = chatActivityEnterView.r2;
                if (jeVar2 != null) {
                    jeVar2.setTranslationX(jeVar2.a);
                    break;
                }
                break;
            case 2:
                chatActivityEnterView.U1.invalidate();
                break;
            case 3:
                chatActivityEnterView.U1.invalidate();
                break;
            case 4:
                int i10 = ChatActivityEnterView.N6;
                chatActivityEnterView.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null) {
                    sfVar.Z();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.r2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i11 = ChatActivityEnterView.N6;
                chatActivityEnterView.v2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.d1) {
                    chatActivityEnterView.i1.setAlpha(chatActivityEnterView.C1 ? 1.0f : chatActivityEnterView.v2.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.i1.invalidate();
                }
                chatActivityEnterView.K0();
                break;
            case 7:
                int i12 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                chatActivityEnterView.u(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                int i13 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                chatActivityEnterView.v5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.p();
                break;
            case 9:
                int i14 = ChatActivityEnterView.N6;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.H1 = floatValue;
                jh.f r02 = chatActivityEnterView.r0();
                if (r02 != null) {
                    r02.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                ud udVar = chatActivityEnterView.f1;
                if (udVar != null) {
                    udVar.invalidate();
                    break;
                }
                break;
            default:
                int i15 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.e2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.e2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.e2.setAlpha(floatValue2);
                break;
        }
    }
}

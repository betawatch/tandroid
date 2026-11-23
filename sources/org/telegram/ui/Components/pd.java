package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ pd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                te teVar = chatActivityEnterView.z2;
                if (teVar != null) {
                    teVar.setTranslationX(teVar.a);
                    break;
                }
                break;
            case 1:
                te teVar2 = chatActivityEnterView.z2;
                if (teVar2 != null) {
                    teVar2.setTranslationX(teVar2.a);
                    break;
                }
                break;
            case 2:
                chatActivityEnterView.c2.invalidate();
                break;
            case 3:
                chatActivityEnterView.c2.invalidate();
                break;
            case 4:
                int i10 = ChatActivityEnterView.s7;
                chatActivityEnterView.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null) {
                    egVar.Z();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.z2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i11 = ChatActivityEnterView.s7;
                chatActivityEnterView.D2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.d1) {
                    chatActivityEnterView.i1.setAlpha(chatActivityEnterView.K1 ? 1.0f : chatActivityEnterView.D2.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.i1.invalidate();
                }
                chatActivityEnterView.X0();
                break;
            case 7:
                int i12 = ChatActivityEnterView.s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.w(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                int i13 = ChatActivityEnterView.s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.B6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg qgVar = chatActivityEnterView.E2;
                if (qgVar != null) {
                    qgVar.invalidate();
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    break;
                }
                break;
            case 9:
                int i14 = ChatActivityEnterView.s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.D5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.r();
                break;
            case 10:
                int i15 = ChatActivityEnterView.s7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.P1 = floatValue;
                jh.f D0 = chatActivityEnterView.D0();
                if (D0 != null) {
                    D0.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                ee eeVar = chatActivityEnterView.f1;
                if (eeVar != null) {
                    eeVar.invalidate();
                    break;
                }
                break;
            default:
                int i16 = ChatActivityEnterView.s7;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.m2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.m2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.m2.setAlpha(floatValue2);
                break;
        }
    }
}

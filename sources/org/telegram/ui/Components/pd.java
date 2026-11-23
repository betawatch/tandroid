package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                se seVar = chatActivityEnterView.z2;
                if (seVar != null) {
                    seVar.setTranslationX(seVar.a);
                    break;
                }
                break;
            case 1:
                se seVar2 = chatActivityEnterView.z2;
                if (seVar2 != null) {
                    seVar2.setTranslationX(seVar2.a);
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
                fg fgVar = chatActivityEnterView.V0;
                if (fgVar != null) {
                    fgVar.Z();
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
                chatActivityEnterView.W0();
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
                rg rgVar = chatActivityEnterView.E2;
                if (rgVar != null) {
                    rgVar.invalidate();
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
                de deVar = chatActivityEnterView.f1;
                if (deVar != null) {
                    deVar.invalidate();
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

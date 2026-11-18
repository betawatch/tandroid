package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                se seVar = chatActivityEnterView.x2;
                if (seVar != null) {
                    seVar.setTranslationX(seVar.a);
                    break;
                }
                break;
            case 1:
                se seVar2 = chatActivityEnterView.x2;
                if (seVar2 != null) {
                    seVar2.setTranslationX(seVar2.a);
                    break;
                }
                break;
            case 2:
                chatActivityEnterView.a2.invalidate();
                break;
            case 3:
                chatActivityEnterView.a2.invalidate();
                break;
            case 4:
                int i10 = ChatActivityEnterView.n7;
                chatActivityEnterView.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg cgVar = chatActivityEnterView.V0;
                if (cgVar != null) {
                    cgVar.Z();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.x2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i11 = ChatActivityEnterView.n7;
                chatActivityEnterView.B2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.d1) {
                    chatActivityEnterView.i1.setAlpha(chatActivityEnterView.I1 ? 1.0f : chatActivityEnterView.B2.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.i1.invalidate();
                }
                chatActivityEnterView.S0();
                break;
            case 7:
                int i12 = ChatActivityEnterView.n7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.w(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                int i13 = ChatActivityEnterView.n7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.z6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg pgVar = chatActivityEnterView.C2;
                if (pgVar != null) {
                    pgVar.invalidate();
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    break;
                }
                break;
            case 9:
                int i14 = ChatActivityEnterView.n7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.B5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.r();
                break;
            case 10:
                int i15 = ChatActivityEnterView.n7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.N1 = floatValue;
                jh.f z02 = chatActivityEnterView.z0();
                if (z02 != null) {
                    z02.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                de deVar = chatActivityEnterView.f1;
                if (deVar != null) {
                    deVar.invalidate();
                    break;
                }
                break;
            default:
                int i16 = ChatActivityEnterView.n7;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.k2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.k2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.k2.setAlpha(floatValue2);
                break;
        }
    }
}

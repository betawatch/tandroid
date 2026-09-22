package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ qd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                ze zeVar = chatActivityEnterView.J1;
                if (zeVar != null) {
                    zeVar.setTranslationX(zeVar.a);
                    break;
                }
                break;
            case 1:
                ze zeVar2 = chatActivityEnterView.J1;
                if (zeVar2 != null) {
                    zeVar2.setTranslationX(zeVar2.a);
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
                int i11 = ChatActivityEnterView.n5;
                chatActivityEnterView.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    dgVar.Y();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i12 = ChatActivityEnterView.n5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.c1) {
                    chatActivityEnterView.h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.h1.invalidate();
                }
                chatActivityEnterView.x0();
                break;
            default:
                int i13 = ChatActivityEnterView.n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.w1.setAlpha(floatValue);
                break;
        }
    }
}

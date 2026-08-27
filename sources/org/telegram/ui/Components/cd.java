package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ cd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                me meVar = chatActivityEnterView.E1;
                if (meVar != null) {
                    meVar.setTranslationX(meVar.a);
                    break;
                }
                break;
            case 1:
                me meVar2 = chatActivityEnterView.E1;
                if (meVar2 != null) {
                    meVar2.setTranslationX(meVar2.a);
                    break;
                }
                break;
            case 2:
                chatActivityEnterView.h1.invalidate();
                break;
            case 3:
                chatActivityEnterView.h1.invalidate();
                break;
            case 4:
                int i11 = ChatActivityEnterView.i5;
                chatActivityEnterView.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qf qfVar = chatActivityEnterView.Q0;
                if (qfVar != null) {
                    qfVar.a0();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.E1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i12 = ChatActivityEnterView.i5;
                chatActivityEnterView.I1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.Y0) {
                    chatActivityEnterView.d1.setAlpha(chatActivityEnterView.I1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.d1.invalidate();
                }
                chatActivityEnterView.x0();
                break;
            default:
                int i13 = ChatActivityEnterView.i5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.r1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.r1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.r1.setAlpha(floatValue);
                break;
        }
    }
}

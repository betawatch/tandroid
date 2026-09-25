package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ rd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                af afVar = chatActivityEnterView.J1;
                if (afVar != null) {
                    afVar.setTranslationX(afVar.a);
                    break;
                }
                break;
            case 1:
                af afVar2 = chatActivityEnterView.J1;
                if (afVar2 != null) {
                    afVar2.setTranslationX(afVar2.a);
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
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null) {
                    egVar.Y();
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

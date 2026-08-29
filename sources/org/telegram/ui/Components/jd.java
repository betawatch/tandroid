package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ jd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                te teVar = chatActivityEnterView.E1;
                if (teVar != null) {
                    teVar.setTranslationX(teVar.a);
                    break;
                }
                break;
            case 1:
                te teVar2 = chatActivityEnterView.E1;
                if (teVar2 != null) {
                    teVar2.setTranslationX(teVar2.a);
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
                xf xfVar = chatActivityEnterView.Q0;
                if (xfVar != null) {
                    xfVar.a0();
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

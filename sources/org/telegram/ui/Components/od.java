package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ od(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                xe xeVar = chatActivityEnterView.I1;
                if (xeVar != null) {
                    xeVar.setTranslationX(xeVar.a);
                    break;
                }
                break;
            case 1:
                xe xeVar2 = chatActivityEnterView.I1;
                if (xeVar2 != null) {
                    xeVar2.setTranslationX(xeVar2.a);
                    break;
                }
                break;
            case 2:
                chatActivityEnterView.l1.invalidate();
                break;
            case 3:
                chatActivityEnterView.l1.invalidate();
                break;
            case 4:
                int i11 = ChatActivityEnterView.n5;
                chatActivityEnterView.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg cgVar = chatActivityEnterView.U0;
                if (cgVar != null) {
                    cgVar.Y();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.I1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i12 = ChatActivityEnterView.n5;
                chatActivityEnterView.M1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.c1) {
                    chatActivityEnterView.h1.setAlpha(chatActivityEnterView.M1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.h1.invalidate();
                }
                chatActivityEnterView.y0();
                break;
            default:
                int i13 = ChatActivityEnterView.n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.v1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.v1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.v1.setAlpha(floatValue);
                break;
        }
    }
}

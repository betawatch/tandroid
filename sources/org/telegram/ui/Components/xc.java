package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ xc(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.a = i3;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i3) {
            case 0:
                ge geVar = chatActivityEnterView.K1;
                if (geVar != null) {
                    geVar.setTranslationX(geVar.a);
                    break;
                }
                break;
            case 1:
                ge geVar2 = chatActivityEnterView.K1;
                if (geVar2 != null) {
                    geVar2.setTranslationX(geVar2.a);
                    break;
                }
                break;
            case 2:
                chatActivityEnterView.n1.invalidate();
                break;
            case 3:
                chatActivityEnterView.n1.invalidate();
                break;
            case 4:
                int i10 = ChatActivityEnterView.t5;
                chatActivityEnterView.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kf kfVar = chatActivityEnterView.V0;
                if (kfVar != null) {
                    kfVar.Z();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.K1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i11 = ChatActivityEnterView.t5;
                chatActivityEnterView.O1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.d1) {
                    chatActivityEnterView.i1.setAlpha(chatActivityEnterView.O1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.i1.invalidate();
                }
                chatActivityEnterView.v0();
                break;
            default:
                int i12 = ChatActivityEnterView.t5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.x1.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.x1.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.x1.setAlpha(floatValue);
                break;
        }
    }
}

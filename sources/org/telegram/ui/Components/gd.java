package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ gd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                qe qeVar = chatActivityEnterView.F1;
                if (qeVar != null) {
                    qeVar.setTranslationX(qeVar.a);
                    break;
                }
                break;
            case 1:
                qe qeVar2 = chatActivityEnterView.F1;
                if (qeVar2 != null) {
                    qeVar2.setTranslationX(qeVar2.a);
                    break;
                }
                break;
            case 2:
                chatActivityEnterView.i1.invalidate();
                break;
            case 3:
                chatActivityEnterView.i1.invalidate();
                break;
            case 4:
                int i11 = ChatActivityEnterView.j5;
                chatActivityEnterView.t0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null) {
                    ufVar.a0();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.F1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i12 = ChatActivityEnterView.j5;
                chatActivityEnterView.J1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.Z0) {
                    chatActivityEnterView.e1.setAlpha(chatActivityEnterView.J1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.e1.invalidate();
                }
                chatActivityEnterView.x0();
                break;
            default:
                int i13 = ChatActivityEnterView.j5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.s1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.s1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.s1.setAlpha(floatValue);
                break;
        }
    }
}

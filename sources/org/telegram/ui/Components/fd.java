package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ fd(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.a = i9;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i9) {
            case 0:
                qe qeVar = chatActivityEnterView.E1;
                if (qeVar != null) {
                    qeVar.setTranslationX(qeVar.a);
                    break;
                }
                break;
            case 1:
                qe qeVar2 = chatActivityEnterView.E1;
                if (qeVar2 != null) {
                    qeVar2.setTranslationX(qeVar2.a);
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
                int i10 = ChatActivityEnterView.i5;
                chatActivityEnterView.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uf ufVar = chatActivityEnterView.Q0;
                if (ufVar != null) {
                    ufVar.Z();
                    break;
                }
                break;
            case 5:
                chatActivityEnterView.E1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i11 = ChatActivityEnterView.i5;
                chatActivityEnterView.I1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.Y0) {
                    chatActivityEnterView.d1.setAlpha(chatActivityEnterView.I1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.d1.invalidate();
                }
                chatActivityEnterView.w0();
                break;
            default:
                int i12 = ChatActivityEnterView.i5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.r1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.r1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.r1.setAlpha(floatValue);
                break;
        }
    }
}

// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bx1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ bx1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                cy1 cy1Var = chatActivityEnterView.z2;
                if (cy1Var != null) {
                    cy1Var.setTranslationX(cy1Var.a);
                    break;
                }
                break;
            case 1:
                int i2 = ChatActivityEnterView.z7;
                cy1 cy1Var2 = chatActivityEnterView.z2;
                if (cy1Var2 != null) {
                    cy1Var2.setTranslationX(cy1Var2.a);
                    break;
                }
                break;
            case 2:
                int i3 = ChatActivityEnterView.z7;
                chatActivityEnterView.c2.invalidate();
                break;
            case 3:
                int i4 = ChatActivityEnterView.z7;
                chatActivityEnterView.c2.invalidate();
                break;
            case 4:
                int i5 = ChatActivityEnterView.z7;
                chatActivityEnterView.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jz1 jz1Var = chatActivityEnterView.V0;
                if (jz1Var != null) {
                    jz1Var.Z();
                    break;
                }
                break;
            case 5:
                int i6 = ChatActivityEnterView.z7;
                chatActivityEnterView.z2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i7 = ChatActivityEnterView.z7;
                chatActivityEnterView.D2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.d1) {
                    chatActivityEnterView.i1.setAlpha(chatActivityEnterView.K1 ? 1.0f : chatActivityEnterView.D2.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.i1.invalidate();
                }
                chatActivityEnterView.V0();
                break;
            case 7:
                int i8 = ChatActivityEnterView.z7;
                chatActivityEnterView.u(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                int i9 = ChatActivityEnterView.z7;
                chatActivityEnterView.A6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = chatActivityEnterView.E2;
                if (lVar != null) {
                    lVar.invalidate();
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    break;
                }
                break;
            case 9:
                int i10 = ChatActivityEnterView.z7;
                chatActivityEnterView.C5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.p();
                break;
            case 10:
                int i11 = ChatActivityEnterView.z7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.P1 = floatValue;
                va2 C0 = chatActivityEnterView.C0();
                if (C0 != null) {
                    C0.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                px1 px1Var = chatActivityEnterView.f1;
                if (px1Var != null) {
                    px1Var.invalidate();
                    break;
                }
                break;
            default:
                int i12 = ChatActivityEnterView.z7;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.m2.setScaleX(gm.R1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.m2.setScaleY(gm.R1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.m2.setAlpha(floatValue2);
                break;
        }
    }
}

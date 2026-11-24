// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nx1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ nx1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 4:
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.i3 = null;
                    break;
                }
                break;
            case 5:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            case 6:
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.i3 = null;
                    break;
                }
                break;
            case 7:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            case 8:
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.i3 = null;
                    break;
                }
                break;
            case 9:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                chatActivityEnterView.r4 = null;
                chatActivityEnterView.V0.setLayerType(0, null);
                break;
            case 1:
                chatActivityEnterView.r4 = null;
                chatActivityEnterView.V0.setLayerType(0, null);
                chatActivityEnterView.A4.e();
                break;
            case 2:
                chatActivityEnterView.c0.setVisibility(8);
                break;
            case 3:
                px1 px1Var = chatActivityEnterView.f1;
                if (px1Var != null) {
                    px1Var.setVisibility(8);
                }
                chatActivityEnterView.s1();
                sy1 sy1Var = chatActivityEnterView.F0;
                if (sy1Var != null) {
                    sy1Var.requestFocus();
                }
                chatActivityEnterView.V0();
                break;
            case 4:
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.f2.setVisibility(8);
                    chatActivityEnterView.i3 = null;
                    break;
                }
                break;
            case 5:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView.Q0.setVisibility(8);
                    chatActivityEnterView.a1.setVisibility(8);
                    tx1 tx1Var = chatActivityEnterView.T0;
                    if (tx1Var != null) {
                        tx1Var.setVisibility(8);
                    }
                    chatActivityEnterView.h3 = null;
                    chatActivityEnterView.l3 = (byte) 0;
                    break;
                }
                break;
            case 6:
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.i3 = null;
                    break;
                }
                break;
            case 7:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView.Q0.setVisibility(8);
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.a1.setVisibility(8);
                    chatActivityEnterView.T0.setVisibility(0);
                    chatActivityEnterView.h3 = null;
                    chatActivityEnterView.l3 = (byte) 0;
                    break;
                }
                break;
            case 8:
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.i3 = null;
                    break;
                }
                break;
            case 9:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.h3 = null;
                    chatActivityEnterView.l3 = (byte) 0;
                    a aVar = chatActivityEnterView.a1;
                    if (aVar != null) {
                        aVar.setVisibility(0);
                        break;
                    }
                }
                break;
            case 10:
                zx1 zx1Var = chatActivityEnterView.c1;
                if (zx1Var != null) {
                    zx1Var.setScaleX(1.0f);
                    zx1Var.setScaleY(1.0f);
                    break;
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                zx1 zx1Var2 = chatActivityEnterView.c1;
                if (zx1Var2 != null) {
                    zx1Var2.setAlpha(1.0f);
                }
                a aVar2 = chatActivityEnterView.a1;
                if (aVar2 != null) {
                    aVar2.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                chatActivityEnterView.W0 = null;
                uz1 uz1Var = chatActivityEnterView.P3;
                if (uz1Var != null) {
                    uz1Var.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                chatActivityEnterView.A4.e();
                break;
        }
    }
}

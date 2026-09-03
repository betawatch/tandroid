package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pe extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ pe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (animator.equals(chatActivityEnterView.o2)) {
                    chatActivityEnterView.o2 = null;
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.n2)) {
                    chatActivityEnterView2.n2 = null;
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.o2)) {
                    chatActivityEnterView3.o2 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.n2)) {
                    chatActivityEnterView4.n2 = null;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.o2)) {
                    chatActivityEnterView5.o2 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.n2)) {
                    chatActivityEnterView6.n2 = null;
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
        switch (this.a) {
            case 0:
                this.b.V.setVisibility(8);
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.b;
                ae aeVar = chatActivityEnterView.b1;
                if (aeVar != null) {
                    aeVar.setVisibility(8);
                }
                ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null) {
                    ffVar.requestFocus();
                }
                chatActivityEnterView.x0();
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.o2)) {
                    chatActivityEnterView2.l1.setVisibility(8);
                    chatActivityEnterView2.o2 = null;
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.n2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.M0.setVisibility(8);
                    chatActivityEnterView3.W0.setVisibility(8);
                    se seVar = chatActivityEnterView3.P0;
                    if (seVar != null) {
                        seVar.setVisibility(8);
                    }
                    chatActivityEnterView3.n2 = null;
                    chatActivityEnterView3.r2 = 0;
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.o2)) {
                    chatActivityEnterView4.o2 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.n2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.M0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.W0.setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(0);
                    chatActivityEnterView5.n2 = null;
                    chatActivityEnterView5.r2 = 0;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.o2)) {
                    chatActivityEnterView6.o2 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.b;
                if (animator.equals(chatActivityEnterView7.n2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.n2 = null;
                    chatActivityEnterView7.r2 = 0;
                    le leVar = chatActivityEnterView7.W0;
                    if (leVar != null) {
                        leVar.setVisibility(0);
                        break;
                    }
                }
                break;
            case 8:
                me meVar = this.b.Y0;
                if (meVar != null) {
                    meVar.setScaleX(1.0f);
                    meVar.setScaleY(1.0f);
                    break;
                }
                break;
            case 9:
                super.onAnimationEnd(animator);
                me meVar2 = this.b.Y0;
                if (meVar2 != null) {
                    meVar2.setAlpha(1.0f);
                    break;
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                chatActivityEnterView8.S0 = null;
                eg egVar = chatActivityEnterView8.V2;
                if (egVar != null) {
                    egVar.x(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.H3.unlock();
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.b;
                chatActivityEnterView9.x3 = null;
                chatActivityEnterView9.R0.setLayerType(0, null);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.b;
                chatActivityEnterView10.x3 = null;
                chatActivityEnterView10.R0.setLayerType(0, null);
                chatActivityEnterView10.H3.unlock();
                break;
        }
    }
}

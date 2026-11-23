package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class be extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ be(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.i3 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.h3)) {
                    chatActivityEnterView2.h3 = null;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.i3)) {
                    chatActivityEnterView3.i3 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.h3)) {
                    chatActivityEnterView4.h3 = null;
                    break;
                }
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.i3)) {
                    chatActivityEnterView5.i3 = null;
                    break;
                }
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.h3)) {
                    chatActivityEnterView6.h3 = null;
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
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.r4 = null;
                chatActivityEnterView.V0.setLayerType(0, null);
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.r4 = null;
                chatActivityEnterView2.V0.setLayerType(0, null);
                chatActivityEnterView2.B4.e();
                break;
            case 2:
                this.b.c0.setVisibility(8);
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                ee eeVar = chatActivityEnterView3.f1;
                if (eeVar != null) {
                    eeVar.setVisibility(8);
                }
                chatActivityEnterView3.s1();
                hf hfVar = chatActivityEnterView3.F0;
                if (hfVar != null) {
                    hfVar.requestFocus();
                }
                chatActivityEnterView3.X0();
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.i3)) {
                    chatActivityEnterView4.f2.setVisibility(8);
                    chatActivityEnterView4.i3 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.h3)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.Q0.setVisibility(8);
                    chatActivityEnterView5.a1.setVisibility(8);
                    je jeVar = chatActivityEnterView5.T0;
                    if (jeVar != null) {
                        jeVar.setVisibility(8);
                    }
                    chatActivityEnterView5.h3 = null;
                    chatActivityEnterView5.l3 = 0;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.i3)) {
                    chatActivityEnterView6.i3 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.b;
                if (animator.equals(chatActivityEnterView7.h3)) {
                    chatActivityEnterView7.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView7.Q0.setVisibility(8);
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.a1.setVisibility(8);
                    chatActivityEnterView7.T0.setVisibility(0);
                    chatActivityEnterView7.h3 = null;
                    chatActivityEnterView7.l3 = 0;
                    break;
                }
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                if (animator.equals(chatActivityEnterView8.i3)) {
                    chatActivityEnterView8.i3 = null;
                    break;
                }
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView9 = this.b;
                if (animator.equals(chatActivityEnterView9.h3)) {
                    chatActivityEnterView9.setSlowModeButtonVisible(false);
                    chatActivityEnterView9.h3 = null;
                    chatActivityEnterView9.l3 = 0;
                    pe peVar = chatActivityEnterView9.a1;
                    if (peVar != null) {
                        peVar.setVisibility(0);
                        break;
                    }
                }
                break;
            case 10:
                qe qeVar = this.b.c1;
                if (qeVar != null) {
                    qeVar.setScaleX(1.0f);
                    qeVar.setScaleY(1.0f);
                    break;
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ChatActivityEnterView chatActivityEnterView10 = this.b;
                qe qeVar2 = chatActivityEnterView10.c1;
                if (qeVar2 != null) {
                    qeVar2.setAlpha(1.0f);
                }
                pe peVar2 = chatActivityEnterView10.a1;
                if (peVar2 != null) {
                    peVar2.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView11 = this.b;
                chatActivityEnterView11.W0 = null;
                mg mgVar = chatActivityEnterView11.P3;
                if (mgVar != null) {
                    mgVar.u(0.0f);
                }
                chatActivityEnterView11.requestLayout();
                chatActivityEnterView11.B4.e();
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ie extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ie(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (animator.equals(chatActivityEnterView.a3)) {
                    chatActivityEnterView.a3 = null;
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.Z2)) {
                    chatActivityEnterView2.Z2 = null;
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.a3)) {
                    chatActivityEnterView3.a3 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.Z2)) {
                    chatActivityEnterView4.Z2 = null;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.a3)) {
                    chatActivityEnterView5.a3 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.Z2)) {
                    chatActivityEnterView6.Z2 = null;
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
                this.b.c0.setVisibility(8);
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.b;
                ud udVar = chatActivityEnterView.f1;
                if (udVar != null) {
                    udVar.setVisibility(8);
                }
                chatActivityEnterView.f1();
                xe xeVar = chatActivityEnterView.F0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                }
                chatActivityEnterView.K0();
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.a3)) {
                    chatActivityEnterView2.X1.setVisibility(8);
                    chatActivityEnterView2.a3 = null;
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.Z2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.Q0.setVisibility(8);
                    chatActivityEnterView3.a1.setVisibility(8);
                    zd zdVar = chatActivityEnterView3.T0;
                    if (zdVar != null) {
                        zdVar.setVisibility(8);
                    }
                    chatActivityEnterView3.Z2 = null;
                    chatActivityEnterView3.d3 = 0;
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.a3)) {
                    chatActivityEnterView4.a3 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.Z2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.Q0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.a1.setVisibility(8);
                    chatActivityEnterView5.T0.setVisibility(0);
                    chatActivityEnterView5.Z2 = null;
                    chatActivityEnterView5.d3 = 0;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.a3)) {
                    chatActivityEnterView6.a3 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.b;
                if (animator.equals(chatActivityEnterView7.Z2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.Z2 = null;
                    chatActivityEnterView7.d3 = 0;
                    ee eeVar = chatActivityEnterView7.a1;
                    if (eeVar != null) {
                        eeVar.setVisibility(0);
                        break;
                    }
                }
                break;
            case 8:
                fe feVar = this.b.c1;
                if (feVar != null) {
                    feVar.setScaleX(1.0f);
                    feVar.setScaleY(1.0f);
                    break;
                }
                break;
            case 9:
                super.onAnimationEnd(animator);
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                fe feVar2 = chatActivityEnterView8.c1;
                if (feVar2 != null) {
                    feVar2.setAlpha(1.0f);
                }
                ee eeVar2 = chatActivityEnterView8.a1;
                if (eeVar2 != null) {
                    eeVar2.setAlpha(1.0f);
                    break;
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView9 = this.b;
                chatActivityEnterView9.W0 = null;
                cg cgVar = chatActivityEnterView9.H3;
                if (cgVar != null) {
                    cgVar.y(0.0f);
                }
                chatActivityEnterView9.requestLayout();
                chatActivityEnterView9.t4.e();
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView10 = this.b;
                chatActivityEnterView10.j4 = null;
                chatActivityEnterView10.V0.setLayerType(0, null);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView11 = this.b;
                chatActivityEnterView11.j4 = null;
                chatActivityEnterView11.V0.setLayerType(0, null);
                chatActivityEnterView11.t4.e();
                break;
        }
    }
}

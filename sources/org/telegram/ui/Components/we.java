package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class we extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ we(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (animator.equals(chatActivityEnterView.r2)) {
                    chatActivityEnterView.r2 = null;
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.q2)) {
                    chatActivityEnterView2.q2 = null;
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.r2)) {
                    chatActivityEnterView3.r2 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.q2)) {
                    chatActivityEnterView4.q2 = null;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.r2)) {
                    chatActivityEnterView5.r2 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.q2)) {
                    chatActivityEnterView6.q2 = null;
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
                this.b.b0.setVisibility(8);
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.b;
                ie ieVar = chatActivityEnterView.e1;
                if (ieVar != null) {
                    ieVar.setVisibility(8);
                }
                of ofVar = chatActivityEnterView.E0;
                if (ofVar != null) {
                    ofVar.requestFocus();
                }
                chatActivityEnterView.y0();
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.r2)) {
                    chatActivityEnterView2.o1.setVisibility(8);
                    chatActivityEnterView2.r2 = null;
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.q2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    ze zeVar = chatActivityEnterView3.S0;
                    if (zeVar != null) {
                        zeVar.setVisibility(8);
                    }
                    chatActivityEnterView3.q2 = null;
                    chatActivityEnterView3.u2 = 0;
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.r2)) {
                    chatActivityEnterView4.r2 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.q2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.q2 = null;
                    chatActivityEnterView5.u2 = 0;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.r2)) {
                    chatActivityEnterView6.r2 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.b;
                if (animator.equals(chatActivityEnterView7.q2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.q2 = null;
                    chatActivityEnterView7.u2 = 0;
                    se seVar = chatActivityEnterView7.Z0;
                    if (seVar != null) {
                        seVar.setVisibility(0);
                        break;
                    }
                }
                break;
            case 8:
                te teVar = this.b.b1;
                if (teVar != null) {
                    teVar.setScaleX(1.0f);
                    teVar.setScaleY(1.0f);
                    break;
                }
                break;
            case 9:
                super.onAnimationEnd(animator);
                te teVar2 = this.b.b1;
                if (teVar2 != null) {
                    teVar2.setAlpha(1.0f);
                    break;
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                chatActivityEnterView8.V0 = null;
                mg mgVar = chatActivityEnterView8.Y2;
                if (mgVar != null) {
                    mgVar.y(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.K3.unlock();
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.b;
                chatActivityEnterView9.A3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.b;
                chatActivityEnterView10.A3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.K3.unlock();
                break;
        }
    }
}

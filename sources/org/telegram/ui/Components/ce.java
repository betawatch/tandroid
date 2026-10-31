package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ce extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ce(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (animator.equals(chatActivityEnterView.s2)) {
                    chatActivityEnterView.s2 = null;
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.r2)) {
                    chatActivityEnterView2.r2 = null;
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.s2)) {
                    chatActivityEnterView3.s2 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.r2)) {
                    chatActivityEnterView4.r2 = null;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.s2)) {
                    chatActivityEnterView5.s2 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.r2)) {
                    chatActivityEnterView6.r2 = null;
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
                pd pdVar = chatActivityEnterView.e1;
                if (pdVar != null) {
                    pdVar.setVisibility(8);
                }
                se seVar = chatActivityEnterView.E0;
                if (seVar != null) {
                    seVar.requestFocus();
                }
                chatActivityEnterView.u0();
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.s2)) {
                    chatActivityEnterView2.p1.setVisibility(8);
                    chatActivityEnterView2.s2 = null;
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.r2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.P0.setVisibility(8);
                    chatActivityEnterView3.Z0.setVisibility(8);
                    fe feVar = chatActivityEnterView3.S0;
                    if (feVar != null) {
                        feVar.setVisibility(8);
                    }
                    chatActivityEnterView3.r2 = null;
                    chatActivityEnterView3.v2 = 0;
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.s2)) {
                    chatActivityEnterView4.s2 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.r2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.P0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.Z0.setVisibility(8);
                    chatActivityEnterView5.S0.setVisibility(0);
                    chatActivityEnterView5.r2 = null;
                    chatActivityEnterView5.v2 = 0;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.s2)) {
                    chatActivityEnterView6.s2 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.b;
                if (animator.equals(chatActivityEnterView7.r2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.r2 = null;
                    chatActivityEnterView7.v2 = 0;
                    yd ydVar = chatActivityEnterView7.Z0;
                    if (ydVar != null) {
                        ydVar.setVisibility(0);
                        break;
                    }
                }
                break;
            case 8:
                zd zdVar = this.b.b1;
                if (zdVar != null) {
                    zdVar.setScaleX(1.0f);
                    zdVar.setScaleY(1.0f);
                    break;
                }
                break;
            case 9:
                super.onAnimationEnd(animator);
                zd zdVar2 = this.b.b1;
                if (zdVar2 != null) {
                    zdVar2.setAlpha(1.0f);
                    break;
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                chatActivityEnterView8.V0 = null;
                sf sfVar = chatActivityEnterView8.Z2;
                if (sfVar != null) {
                    sfVar.y(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.L3.e();
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.b;
                chatActivityEnterView9.B3 = null;
                chatActivityEnterView9.U0.setLayerType(0, null);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.b;
                chatActivityEnterView10.B3 = null;
                chatActivityEnterView10.U0.setLayerType(0, null);
                chatActivityEnterView10.L3.e();
                break;
        }
    }
}

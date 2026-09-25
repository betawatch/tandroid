package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ze extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ze(ChatActivityEnterView chatActivityEnterView, int i10) {
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
                le leVar = chatActivityEnterView.e1;
                if (leVar != null) {
                    leVar.setVisibility(8);
                }
                qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null) {
                    qfVar.requestFocus();
                }
                chatActivityEnterView.x0();
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
                    cf cfVar = chatActivityEnterView3.S0;
                    if (cfVar != null) {
                        cfVar.setVisibility(8);
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
                    ve veVar = chatActivityEnterView7.Z0;
                    if (veVar != null) {
                        veVar.setVisibility(0);
                        break;
                    }
                }
                break;
            case 8:
                we weVar = this.b.b1;
                if (weVar != null) {
                    weVar.setScaleX(1.0f);
                    weVar.setScaleY(1.0f);
                    break;
                }
                break;
            case 9:
                super.onAnimationEnd(animator);
                we weVar2 = this.b.b1;
                if (weVar2 != null) {
                    weVar2.setAlpha(1.0f);
                    break;
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                chatActivityEnterView8.V0 = null;
                og ogVar = chatActivityEnterView8.Z2;
                if (ogVar != null) {
                    ogVar.y(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.L3.unlock();
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
                chatActivityEnterView10.L3.unlock();
                break;
        }
    }
}

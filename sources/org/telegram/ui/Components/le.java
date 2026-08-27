package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class le extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ le(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (animator.equals(chatActivityEnterView.n2)) {
                    chatActivityEnterView.n2 = null;
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.m2)) {
                    chatActivityEnterView2.m2 = null;
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.n2)) {
                    chatActivityEnterView3.n2 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.m2)) {
                    chatActivityEnterView4.m2 = null;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.n2)) {
                    chatActivityEnterView5.n2 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.m2)) {
                    chatActivityEnterView6.m2 = null;
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
                this.b.U.setVisibility(8);
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.b;
                wd wdVar = chatActivityEnterView.a1;
                if (wdVar != null) {
                    wdVar.setVisibility(8);
                }
                bf bfVar = chatActivityEnterView.A0;
                if (bfVar != null) {
                    bfVar.requestFocus();
                }
                chatActivityEnterView.x0();
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (animator.equals(chatActivityEnterView2.n2)) {
                    chatActivityEnterView2.k1.setVisibility(8);
                    chatActivityEnterView2.n2 = null;
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                if (animator.equals(chatActivityEnterView3.m2)) {
                    chatActivityEnterView3.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView3.L0.setVisibility(8);
                    chatActivityEnterView3.V0.setVisibility(8);
                    oe oeVar = chatActivityEnterView3.O0;
                    if (oeVar != null) {
                        oeVar.setVisibility(8);
                    }
                    chatActivityEnterView3.m2 = null;
                    chatActivityEnterView3.q2 = 0;
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                if (animator.equals(chatActivityEnterView4.n2)) {
                    chatActivityEnterView4.n2 = null;
                    break;
                }
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                if (animator.equals(chatActivityEnterView5.m2)) {
                    chatActivityEnterView5.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView5.L0.setVisibility(8);
                    chatActivityEnterView5.setSlowModeButtonVisible(false);
                    chatActivityEnterView5.V0.setVisibility(8);
                    chatActivityEnterView5.O0.setVisibility(0);
                    chatActivityEnterView5.m2 = null;
                    chatActivityEnterView5.q2 = 0;
                    break;
                }
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                if (animator.equals(chatActivityEnterView6.n2)) {
                    chatActivityEnterView6.n2 = null;
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView7 = this.b;
                if (animator.equals(chatActivityEnterView7.m2)) {
                    chatActivityEnterView7.setSlowModeButtonVisible(false);
                    chatActivityEnterView7.m2 = null;
                    chatActivityEnterView7.q2 = 0;
                    he heVar = chatActivityEnterView7.V0;
                    if (heVar != null) {
                        heVar.setVisibility(0);
                        break;
                    }
                }
                break;
            case 8:
                ie ieVar = this.b.X0;
                if (ieVar != null) {
                    ieVar.setScaleX(1.0f);
                    ieVar.setScaleY(1.0f);
                    break;
                }
                break;
            case 9:
                super.onAnimationEnd(animator);
                ie ieVar2 = this.b.X0;
                if (ieVar2 != null) {
                    ieVar2.setAlpha(1.0f);
                    break;
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                chatActivityEnterView8.R0 = null;
                ag agVar = chatActivityEnterView8.U2;
                if (agVar != null) {
                    agVar.n(0.0f);
                }
                chatActivityEnterView8.requestLayout();
                chatActivityEnterView8.G3.unlock();
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView9 = this.b;
                chatActivityEnterView9.w3 = null;
                chatActivityEnterView9.Q0.setLayerType(0, null);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView10 = this.b;
                chatActivityEnterView10.w3 = null;
                chatActivityEnterView10.Q0.setLayerType(0, null);
                chatActivityEnterView10.G3.unlock();
                break;
        }
    }
}

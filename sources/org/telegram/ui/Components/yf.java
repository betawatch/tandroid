package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ yf(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.a = i11;
        this.c = chatActivityEnterView;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (i10 == 0) {
                    chatActivityEnterView.w2 = 0;
                }
                chatActivityEnterView.S0 = null;
                chatActivityEnterView.D1.setTranslationY(0.0f);
                chatActivityEnterView.D1.setVisibility(8);
                chatActivityEnterView.H3.unlock();
                eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                pv0 pv0Var = chatActivityEnterView2.i1;
                chatActivityEnterView2.w3 = false;
                chatActivityEnterView2.x3 = null;
                uf ufVar = chatActivityEnterView2.R0;
                if (ufVar != null) {
                    if (chatActivityEnterView2.Z4 == null) {
                        ufVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.R0.setLayerType(0, null);
                }
                if (pv0Var != null) {
                    pv0Var.requestLayout();
                    pv0Var.setForeground(null);
                    pv0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.v2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.b2, true, true);
                }
                yd ydVar = chatActivityEnterView2.o0;
                if (ydVar != null) {
                    ydVar.run();
                    chatActivityEnterView2.o0 = null;
                }
                chatActivityEnterView2.H3.unlock();
                break;
        }
    }
}

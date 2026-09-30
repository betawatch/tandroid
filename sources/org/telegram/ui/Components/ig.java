package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ig extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ ig(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
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
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                cw0 cw0Var = chatActivityEnterView2.m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                eg egVar = chatActivityEnterView2.U0;
                if (egVar != null) {
                    if (chatActivityEnterView2.d5 == null) {
                        egVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (cw0Var != null) {
                    cw0Var.requestLayout();
                    cw0Var.setForeground(null);
                    cw0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.z2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f2, true, true);
                }
                je jeVar = chatActivityEnterView2.r0;
                if (jeVar != null) {
                    jeVar.run();
                    chatActivityEnterView2.r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                break;
        }
    }
}

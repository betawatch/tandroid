package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ pf(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i7 = this.b;
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (i7 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.e();
                vf vfVar = chatActivityEnterView.Z2;
                if (vfVar != null) {
                    vfVar.w(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                st0 st0Var = chatActivityEnterView2.m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                lf lfVar = chatActivityEnterView2.U0;
                if (lfVar != null) {
                    if (chatActivityEnterView2.h5 == null) {
                        lfVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (st0Var != null) {
                    st0Var.requestLayout();
                    st0Var.setForeground(null);
                    st0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.z2 && chatActivityEnterView2.s0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f2, true, true);
                }
                qd qdVar = chatActivityEnterView2.r0;
                if (qdVar != null) {
                    qdVar.run();
                    chatActivityEnterView2.r0 = null;
                }
                chatActivityEnterView2.L3.e();
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sd extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ sd(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                st0 st0Var = chatActivityEnterView.U1;
                chatActivityEnterView.i4 = false;
                chatActivityEnterView.j4 = null;
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null) {
                    if (chatActivityEnterView.C6 == null) {
                        sfVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (st0Var != null) {
                    st0Var.requestLayout();
                    st0Var.setForeground(null);
                    st0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView.h3 && chatActivityEnterView.G0()) {
                    chatActivityEnterView.L1(0, chatActivityEnterView.N2, true, true);
                }
                nd ndVar = chatActivityEnterView.s0;
                if (ndVar != null) {
                    ndVar.run();
                    chatActivityEnterView.s0 = null;
                }
                chatActivityEnterView.t4.e();
                break;
            default:
                int i7 = this.b;
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                if (i7 == 0) {
                    chatActivityEnterView2.i3 = 0;
                }
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.p2.setTranslationY(0.0f);
                chatActivityEnterView2.p2.setVisibility(8);
                chatActivityEnterView2.t4.e();
                cg cgVar = chatActivityEnterView2.H3;
                if (cgVar != null) {
                    cgVar.y(0.0f);
                }
                chatActivityEnterView2.requestLayout();
                break;
        }
    }
}

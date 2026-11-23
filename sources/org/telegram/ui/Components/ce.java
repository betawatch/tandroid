package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ce extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ ce(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                cu0 cu0Var = chatActivityEnterView.c2;
                chatActivityEnterView.q4 = false;
                chatActivityEnterView.r4 = null;
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null) {
                    if (chatActivityEnterView.e7 == null) {
                        egVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (cu0Var != null) {
                    cu0Var.requestLayout();
                    cu0Var.setForeground(null);
                    cu0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView.p3 && chatActivityEnterView.T0()) {
                    chatActivityEnterView.Z1(0, chatActivityEnterView.V2, true, true);
                }
                dd ddVar = chatActivityEnterView.s0;
                if (ddVar != null) {
                    ddVar.run();
                    chatActivityEnterView.s0 = null;
                }
                chatActivityEnterView.B4.e();
                break;
            default:
                int i7 = this.b;
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                if (i7 == 0) {
                    chatActivityEnterView2.q3 = 0;
                }
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.x2.setTranslationY(0.0f);
                chatActivityEnterView2.x2.setVisibility(8);
                chatActivityEnterView2.B4.e();
                mg mgVar = chatActivityEnterView2.P3;
                if (mgVar != null) {
                    mgVar.u(0.0f);
                }
                chatActivityEnterView2.requestLayout();
                break;
        }
    }
}

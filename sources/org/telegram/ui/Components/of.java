package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class of extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ of(ChatActivityEnterView chatActivityEnterView, int i3, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i3 = this.b;
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (i3 == 0) {
                    chatActivityEnterView.B2 = 0;
                }
                chatActivityEnterView.W0 = null;
                chatActivityEnterView.I1.setTranslationY(0.0f);
                chatActivityEnterView.I1.setVisibility(8);
                chatActivityEnterView.M3.e();
                uf ufVar = chatActivityEnterView.a3;
                if (ufVar != null) {
                    ufVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                qt0 qt0Var = chatActivityEnterView2.n1;
                chatActivityEnterView2.B3 = false;
                chatActivityEnterView2.C3 = null;
                kf kfVar = chatActivityEnterView2.V0;
                if (kfVar != null) {
                    if (chatActivityEnterView2.i5 == null) {
                        kfVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.V0.setLayerType(0, null);
                }
                if (qt0Var != null) {
                    qt0Var.requestLayout();
                    qt0Var.setForeground(null);
                    qt0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.A2 && chatActivityEnterView2.r0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.g2, true, true);
                }
                pd pdVar = chatActivityEnterView2.s0;
                if (pdVar != null) {
                    pdVar.run();
                    chatActivityEnterView2.s0 = null;
                }
                chatActivityEnterView2.M3.e();
                break;
        }
    }
}

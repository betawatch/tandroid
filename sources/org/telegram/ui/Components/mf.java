package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ mf(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
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
                chatActivityEnterView.L3.e();
                sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    sfVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                uu0 uu0Var = chatActivityEnterView2.m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                gf gfVar = chatActivityEnterView2.U0;
                if (gfVar != null) {
                    if (chatActivityEnterView2.h5 == null) {
                        gfVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (uu0Var != null) {
                    uu0Var.requestLayout();
                    uu0Var.setForeground(null);
                    uu0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.z2 && chatActivityEnterView2.q0()) {
                    chatActivityEnterView2.r1(0, chatActivityEnterView2.f2, true, true);
                }
                ld ldVar = chatActivityEnterView2.r0;
                if (ldVar != null) {
                    ldVar.run();
                    chatActivityEnterView2.r0 = null;
                }
                chatActivityEnterView2.L3.e();
                break;
        }
    }
}

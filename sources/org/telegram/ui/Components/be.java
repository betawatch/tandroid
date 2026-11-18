package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class be extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ be(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                au0 au0Var = chatActivityEnterView.a2;
                chatActivityEnterView.o4 = false;
                chatActivityEnterView.p4 = null;
                cg cgVar = chatActivityEnterView.V0;
                if (cgVar != null) {
                    if (chatActivityEnterView.c7 == null) {
                        cgVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (au0Var != null) {
                    au0Var.requestLayout();
                    au0Var.setForeground(null);
                    au0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView.n3 && chatActivityEnterView.O0()) {
                    chatActivityEnterView.T1(0, chatActivityEnterView.T2, true, true);
                }
                dd ddVar = chatActivityEnterView.s0;
                if (ddVar != null) {
                    ddVar.run();
                    chatActivityEnterView.s0 = null;
                }
                chatActivityEnterView.z4.e();
                break;
            default:
                int i7 = this.b;
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                if (i7 == 0) {
                    chatActivityEnterView2.o3 = 0;
                }
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.v2.setTranslationY(0.0f);
                chatActivityEnterView2.v2.setVisibility(8);
                chatActivityEnterView2.z4.e();
                kg kgVar = chatActivityEnterView2.N3;
                if (kgVar != null) {
                    kgVar.x(0.0f);
                }
                chatActivityEnterView2.requestLayout();
                break;
        }
    }
}

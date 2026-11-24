package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public g(ChatActivityEnterView chatActivityEnterView, boolean z) {
        this.b = chatActivityEnterView;
        this.a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.j3)) {
            chatActivityEnterView.j3 = null;
        }
        chatActivityEnterView.V0();
        chatActivityEnterView.a2.setAlpha(1.0f);
        chatActivityEnterView.a2.setTranslationX(0.0f);
        l lVar = chatActivityEnterView.E2;
        if (lVar != null && gda.N < 3) {
            ChatActivityEnterView chatActivityEnterView2 = lVar.Q0;
            chatActivityEnterView2.T4 = true;
            chatActivityEnterView2.U4 = System.currentTimeMillis();
        }
        sy1 sy1Var = chatActivityEnterView.F0;
        if (sy1Var != null) {
            sy1Var.setAlpha(chatActivityEnterView.g0() ? 1.0f : 0.0f);
        }
        if (this.a) {
            l49 l49Var = chatActivityEnterView.i1;
            if (l49Var != null) {
                l49Var.setVisibility(8);
            }
            px1 px1Var = chatActivityEnterView.f1;
            if (px1Var != null) {
                px1Var.setVisibility(8);
            }
            chatActivityEnterView.V0();
        }
    }
}

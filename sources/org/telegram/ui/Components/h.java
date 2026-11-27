package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public h(ChatActivityEnterView chatActivityEnterView, boolean z) {
        this.b = chatActivityEnterView;
        this.a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.i3)) {
            chatActivityEnterView.i3 = null;
        }
        chatActivityEnterView.Y0();
        chatActivityEnterView.Z1.setAlpha(1.0f);
        chatActivityEnterView.Z1.setTranslationX(0.0f);
        l lVar = chatActivityEnterView.D2;
        if (lVar != null && xea.N < 3) {
            ChatActivityEnterView chatActivityEnterView2 = lVar.U0;
            chatActivityEnterView2.S4 = true;
            chatActivityEnterView2.T4 = System.currentTimeMillis();
        }
        tx1 tx1Var = chatActivityEnterView.F0;
        if (tx1Var != null) {
            tx1Var.setAlpha(chatActivityEnterView.j0() ? 1.0f : 0.0f);
        }
        if (this.a) {
            x59 x59Var = chatActivityEnterView.i1;
            if (x59Var != null) {
                x59Var.setVisibility(8);
            }
            rw1 rw1Var = chatActivityEnterView.f1;
            if (rw1Var != null) {
                rw1Var.setVisibility(8);
            }
            chatActivityEnterView.Y0();
        }
    }
}

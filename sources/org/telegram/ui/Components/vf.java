package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class vf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public vf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.b = chatActivityEnterView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.j3)) {
            chatActivityEnterView.j3 = null;
        }
        chatActivityEnterView.W0();
        chatActivityEnterView.a2.setAlpha(1.0f);
        chatActivityEnterView.a2.setTranslationX(0.0f);
        rg rgVar = chatActivityEnterView.E2;
        if (rgVar != null && org.telegram.messenger.cz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = rgVar.Q0;
            chatActivityEnterView2.U4 = true;
            chatActivityEnterView2.V4 = System.currentTimeMillis();
        }
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar != null) {
            gfVar.setAlpha(chatActivityEnterView.i0() ? 1.0f : 0.0f);
        }
        if (this.a) {
            zi0 zi0Var = chatActivityEnterView.i1;
            if (zi0Var != null) {
                zi0Var.setVisibility(8);
            }
            de deVar = chatActivityEnterView.f1;
            if (deVar != null) {
                deVar.setVisibility(8);
            }
            chatActivityEnterView.W0();
        }
    }
}

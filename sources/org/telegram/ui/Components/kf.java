package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public kf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.b = chatActivityEnterView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.b3)) {
            chatActivityEnterView.b3 = null;
        }
        chatActivityEnterView.K0();
        chatActivityEnterView.S1.setAlpha(1.0f);
        chatActivityEnterView.S1.setTranslationX(0.0f);
        gg ggVar = chatActivityEnterView.w2;
        if (ggVar != null && org.telegram.messenger.gz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = ggVar.Q0;
            chatActivityEnterView2.M4 = true;
            chatActivityEnterView2.N4 = System.currentTimeMillis();
        }
        xe xeVar = chatActivityEnterView.F0;
        if (xeVar != null) {
            xeVar.setAlpha(0.0f);
        }
        if (this.a) {
            oi0 oi0Var = chatActivityEnterView.i1;
            if (oi0Var != null) {
                oi0Var.setVisibility(8);
            }
            ud udVar = chatActivityEnterView.f1;
            if (udVar != null) {
                udVar.setVisibility(8);
            }
            chatActivityEnterView.K0();
        }
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class af extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public af(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.b = chatActivityEnterView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.u2)) {
            chatActivityEnterView.u2 = null;
        }
        chatActivityEnterView.v0();
        chatActivityEnterView.l1.setAlpha(1.0f);
        chatActivityEnterView.l1.setTranslationX(0.0f);
        yf yfVar = chatActivityEnterView.P1;
        if (yfVar != null && org.telegram.messenger.az.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = yfVar.c0;
            chatActivityEnterView2.f4 = true;
            chatActivityEnterView2.g4 = System.currentTimeMillis();
        }
        ve veVar = chatActivityEnterView.F0;
        if (veVar != null) {
            veVar.setAlpha(0.0f);
        }
        if (this.a) {
            mi0 mi0Var = chatActivityEnterView.i1;
            if (mi0Var != null) {
                mi0Var.setVisibility(8);
            }
            sd sdVar = chatActivityEnterView.f1;
            if (sdVar != null) {
                sdVar.setVisibility(8);
            }
            chatActivityEnterView.v0();
        }
    }
}

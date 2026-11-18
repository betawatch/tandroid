package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class tf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public tf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.b = chatActivityEnterView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.h3)) {
            chatActivityEnterView.h3 = null;
        }
        chatActivityEnterView.S0();
        chatActivityEnterView.Y1.setAlpha(1.0f);
        chatActivityEnterView.Y1.setTranslationX(0.0f);
        pg pgVar = chatActivityEnterView.C2;
        if (pgVar != null && org.telegram.messenger.bz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = pgVar.Q0;
            chatActivityEnterView2.S4 = true;
            chatActivityEnterView2.T4 = System.currentTimeMillis();
        }
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar != null) {
            gfVar.setAlpha(chatActivityEnterView.l1 ? 1.0f : 0.0f);
        }
        if (this.a) {
            xi0 xi0Var = chatActivityEnterView.i1;
            if (xi0Var != null) {
                xi0Var.setVisibility(8);
            }
            de deVar = chatActivityEnterView.f1;
            if (deVar != null) {
                deVar.setVisibility(8);
            }
            chatActivityEnterView.S0();
        }
    }
}

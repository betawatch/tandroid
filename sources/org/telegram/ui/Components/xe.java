package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xe extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public xe(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.b = chatActivityEnterView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.t2)) {
            chatActivityEnterView.t2 = null;
        }
        chatActivityEnterView.u0();
        chatActivityEnterView.k1.setAlpha(1.0f);
        chatActivityEnterView.k1.setTranslationX(0.0f);
        wf wfVar = chatActivityEnterView.O1;
        if (wfVar != null && org.telegram.messenger.tz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = wfVar.b0;
            chatActivityEnterView2.e4 = true;
            chatActivityEnterView2.f4 = System.currentTimeMillis();
        }
        se seVar = chatActivityEnterView.E0;
        if (seVar != null) {
            seVar.setAlpha(0.0f);
        }
        if (this.a) {
            nj0 nj0Var = chatActivityEnterView.h1;
            if (nj0Var != null) {
                nj0Var.setVisibility(8);
            }
            pd pdVar = chatActivityEnterView.e1;
            if (pdVar != null) {
                pdVar.setVisibility(8);
            }
            chatActivityEnterView.u0();
        }
    }
}

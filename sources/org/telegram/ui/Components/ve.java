package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ve extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public ve(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        j71 j71Var = chatActivityEnterView.f1;
        if (j71Var != null) {
            j71Var.setVisibility(8);
        }
        nj0 nj0Var = chatActivityEnterView.h1;
        if (nj0Var != null) {
            nj0Var.setVisibility(8);
        }
        chatActivityEnterView.p4 = 0.0f;
        chatActivityEnterView.u0();
        chatActivityEnterView.l0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}

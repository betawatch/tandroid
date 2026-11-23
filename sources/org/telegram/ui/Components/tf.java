package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class tf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        zi0 zi0Var = chatActivityEnterView.i1;
        if (zi0Var != null && zi0Var.T0 != null) {
            chatActivityEnterView.z5 = new mf(1, this, animator);
            return;
        }
        w61 w61Var = chatActivityEnterView.g1;
        if (w61Var != null) {
            w61Var.setVisibility(8);
        }
        zi0 zi0Var2 = chatActivityEnterView.i1;
        if (zi0Var2 != null) {
            zi0Var2.setVisibility(8);
        }
        chatActivityEnterView.f5 = 0.0f;
        chatActivityEnterView.W0();
        chatActivityEnterView.N0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }
}

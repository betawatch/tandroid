package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        v71 v71Var = chatActivityEnterView.f1;
        if (v71Var != null) {
            v71Var.setVisibility(8);
        }
        gk0 gk0Var = chatActivityEnterView.h1;
        if (gk0Var != null) {
            gk0Var.setVisibility(8);
        }
        chatActivityEnterView.o4 = 0.0f;
        chatActivityEnterView.y0();
        chatActivityEnterView.q0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}

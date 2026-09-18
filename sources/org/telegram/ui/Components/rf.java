package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        w71 w71Var = chatActivityEnterView.f1;
        if (w71Var != null) {
            w71Var.setVisibility(8);
        }
        hk0 hk0Var = chatActivityEnterView.h1;
        if (hk0Var != null) {
            hk0Var.setVisibility(8);
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
